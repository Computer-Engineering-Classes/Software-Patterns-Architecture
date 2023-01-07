package pt.utad.mei.aps;

public class Logger implements ILogger {
    private final Level level;
    private final Device device;

    private ILogger nextLogger;

    public Logger(Level level, Device device) {
        this.level = level;
        this.device = device;
    }

    public void setNextLogger(ILogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void log(String message, Level level) {
        if (this.level == level) {
            switch (device) {
                case STDOUT -> System.out.println(message);
                case STDERR -> System.err.println(message);
                case FILE -> System.out.println("Writing to file: " + message);
            }
        }
        if (nextLogger != null) {
            nextLogger.log(message, level);
        }
    }
}
