package pt.utad.mei.aps;

public class SendDataAdapter implements SendTemperatureData {
    private final SendData sendData;

    public SendDataAdapter(SendData sendData) {
        this.sendData = sendData;
    }

    @Override
    public void send(double temperature) {
        sendData.sendTemp(temperature * 9 / 5 + 32);
    }
}
