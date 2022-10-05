package app.logger;

import app.utils.Utils;

public class DatabaseLogger implements BaseLogger {
    @Override
    public void log(String data) {
        Utils.print("Database logger: " + data);
    }
}
