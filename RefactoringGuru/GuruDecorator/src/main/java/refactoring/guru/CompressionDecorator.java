package refactoring.guru;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Base64;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;

public class CompressionDecorator extends DataSourceDecorator {
    private final int compLevel;

    public CompressionDecorator(DataSource source) {
        super(source);
        this.compLevel = 6;
    }

    @Override
    public void writeData(String data) {
        super.writeData(compress(data));
    }

    @Override
    public String readData() {
        return decompress(super.readData());
    }

    private String compress(String data) {
        byte[] result = data.getBytes();
        try {
            ByteArrayOutputStream bout = new ByteArrayOutputStream(512);
            DeflaterOutputStream dout = new DeflaterOutputStream(bout, new Deflater(compLevel));
            dout.write(result);
            dout.close();
            bout.close();
            return Base64.getEncoder().encodeToString(bout.toByteArray());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    private String decompress(String data) {
        byte[] result = Base64.getDecoder().decode(data);
        try {
            InflaterInputStream iin = new InflaterInputStream(new ByteArrayInputStream(result));
            ByteArrayOutputStream bout = new ByteArrayOutputStream(512);
            int b;
            while ((b = iin.read()) != -1) {
                bout.write(b);
            }
            iin.close();
            bout.close();
            return bout.toString();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
