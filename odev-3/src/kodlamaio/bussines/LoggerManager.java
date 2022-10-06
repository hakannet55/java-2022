package kodlamaio.bussines;

import kodlamaio.Configuration;
import kodlamaio.models.LogTypeEnum;
import kodlamaio.utils.logger.DatabaseLogger;
import kodlamaio.utils.logger.EmailLogger;
import kodlamaio.utils.logger.FileLogger;
import kodlamaio.utils.logger.IBaseLogger;

public class LoggerManager {
    public IBaseLogger logger;
    public static LogTypeEnum logType;

    public LoggerManager() {
        this.logType = Configuration.logType;
        if (this.logType.equals(LogTypeEnum.FILE)) {
            this.logger = new FileLogger();
        } else if (this.logType.equals(LogTypeEnum.DATABASE)) {
            this.logger = new DatabaseLogger();
        } else if (this.logType.equals(LogTypeEnum.EMAIL)) {
            this.logger = new EmailLogger();
        }
    }

    private IBaseLogger getLogger(){
        return this.logger;
    }

    public void log(String message) {
        this.getLogger().log(message);
    }
}
