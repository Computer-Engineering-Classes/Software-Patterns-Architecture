package pt.utad.mei.aps;

public class Main {
    public static void main(String[] args) {
        Logger logger = new Logger(Level.INFO, Device.STDOUT);
        logger.setNextLogger(new Logger(Level.DEBUG, Device.STDERR));
        logger.setNextLogger(new Logger(Level.ERROR, Device.FILE));
        logger.log("This is an info message", Level.INFO);
        logger.log("This is a debug message", Level.DEBUG);
        logger.log("This is an error message", Level.ERROR);
    }
}