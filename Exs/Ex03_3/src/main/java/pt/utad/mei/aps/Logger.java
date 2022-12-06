package pt.utad.mei.aps;

public class Logger {

    private static Logger loggerInstance;

    private Logger() {
    }

    public static Logger getInstance() {
        if (loggerInstance == null) {
            loggerInstance = new Logger();
        }
        return loggerInstance;
    }

    public void log(Level level, Device device, String msg) {
        System.out.printf("LEVEL: %s, Device: %s, Message: %s\n", level, device, msg);
    }
}
