package pt.utad.mei.aps;

public class Main {
    public static void main(String[] args) {
        Logger logger = new Logger(LEVEL.INFO, DEVICE.STDOUT);
        logger.setNextLogger(new Logger(LEVEL.DEBUG, DEVICE.STDERR));
        logger.setNextLogger(new Logger(LEVEL.ERROR, DEVICE.FILE));
        logger.log(LEVEL.INFO, "This is an info message");
        logger.log(LEVEL.DEBUG, "This is a debug message");
        logger.log(LEVEL.ERROR, "This is an error message");
    }
}