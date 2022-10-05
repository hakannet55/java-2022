package app.logger;

import app.utils.Utils;

public class EmailLogger implements BaseLogger {
    @Override
    public void log(String data) {
        Utils.print("Email logger: " + data);
    }
}
