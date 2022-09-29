package logger;

public class DatabaseLogger extends BaseLogger {
    public void Log(String message) {
        System.out.println("Database Log: " + message);
    }
}
