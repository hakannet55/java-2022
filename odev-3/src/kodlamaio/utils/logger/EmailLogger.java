package kodlamaio.utils.logger;

import kodlamaio.utils.Tool;

public class EmailLogger implements IBaseLogger{
    @Override
    public void log(String message) {
        System.out.println("Email Log: " + message);
    }
}
