package logger;

public class FileLogger extends BaseLogger {
    public void Log(String message) {
        System.out.println("File Log: " + message);
    }
}
