package kodlamaio.utils.logger;

import kodlamaio.utils.Tool;

public class EmailLogger implements IBaseLogger{
    @Override
    public void log(String message) {
        Tool.print("Email Log: " + message);
    }
}
