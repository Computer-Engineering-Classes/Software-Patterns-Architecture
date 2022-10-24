package pt.utad.mei.aps;


public class Main {
    public static void main(String[] args) {
        var logger = Logger.getInstance();

        logger.log(Level.ALERT, Device.STDERR, "Casting to 'float' might lead to a loss in precision.");
        logger.log(Level.ERROR, Device.FILE, "The file you are trying to access is currently in use.");
        logger.log(Level.FATAL, Device.TCP_PORT, "A connection with the server could not be established.");
    }
}