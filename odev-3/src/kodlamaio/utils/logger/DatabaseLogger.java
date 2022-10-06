package kodlamaio.utils.logger;

import kodlamaio.utils.Tool;

public class DatabaseLogger implements IBaseLogger {
    @Override
    public void log(String message) {
        Tool.print("Database Log: " + message);
    }
}
