package pt.utad.mei.aps;

enum LEVEL {
    ALERT,
    ERROR,
    FATAL
}

enum DEVICE {
    FILE,
    STDERR,
    TCP_PORT
}

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

    public void log(LEVEL level, DEVICE device, String msg) {
        System.out.printf("LEVEL: %s, DEVICE: %s, Message: %s\n", level, device, msg);
    }
}
