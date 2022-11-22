package pt.utad.mei.aps;


public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();

        logger.log(Level.ALERT, Device.STDERR, "Warning: The type AbsoluteLayout is deprecated.");
        logger.log(Level.ERROR, Device.FILE, "The file does not exist");
        logger.log(Level.FATAL, Device.TCP_PORT, "The port is not available");
    }
}