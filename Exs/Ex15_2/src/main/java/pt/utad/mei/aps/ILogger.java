package pt.utad.mei.aps;

public interface ILogger {
    void setNextLogger(ILogger logger);

    void log(String message, Level level);
}
