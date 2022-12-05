package refactoring.guru;

public class BitrateReader {
    public static VideoFile read(VideoFile file, Codec codec) {
        System.out.println("BitrateReader: reading file...");
        if (!file.getCodecType().equals(codec.getExtension())) {
            throw new IllegalArgumentException("Codec type does not match!");
        }
        return file;
    }

    public static VideoFile convert(VideoFile buffer, Codec codec) {
        System.out.println("BitrateReader: writing file...");
        String oldName = buffer.getName();
        String newName = new StringBuilder(oldName)
                .delete(oldName.lastIndexOf("."), oldName.length())
                .append(".")
                .append(codec.getExtension())
                .toString();
        return new VideoFile(newName);
    }
}
