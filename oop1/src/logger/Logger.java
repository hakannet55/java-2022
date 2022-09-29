package logger;

public class Logger extends BaseLogger {
    public void start() {
        //DatabaseLogger log = new DatabaseLogger();
        //log.Log("Message-1");
 
        BaseLogger[] list = new BaseLogger[]{new DatabaseLogger(), new FileLogger()};
        int i = 0;
        for (BaseLogger itm : list) {
            i++;
            itm.Log("test1:" + i);
        }
    }
}
