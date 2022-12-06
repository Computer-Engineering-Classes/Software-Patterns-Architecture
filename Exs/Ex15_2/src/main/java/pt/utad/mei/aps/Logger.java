package pt.utad.mei.aps;

public class Logger {
    private final LEVEL level;
    private final DEVICE device;

    private Logger nextLogger;

    public Logger(LEVEL level, DEVICE device) {
        this.level = level;
        this.device = device;
    }

    public void setNextLogger(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void log(LEVEL level, String message) {
        if (this.level == level) {
            switch (device) {
                case STDOUT -> System.out.println(message);
                case STDERR -> System.err.println(message);
                case FILE -> System.out.println("Writing to file: " + message);
            }
        }
        if (nextLogger != null) {
            nextLogger.log(level, message);
        }
    }
}
