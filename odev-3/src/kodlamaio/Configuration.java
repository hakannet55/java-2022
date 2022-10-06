package kodlamaio;

import kodlamaio.database.BaseDatabase;
import kodlamaio.models.CurrencyTypeEnum;
import kodlamaio.models.LogTypeEnum;

public class Configuration {
    public static BaseDatabase db;
    public static CurrencyTypeEnum currency;
    public static LogTypeEnum logType;

    public Configuration(BaseDatabase db) {
        Configuration.db = db;
    }

    public static BaseDatabase getDb() {
        return db;
    }

    public static void setDb(BaseDatabase db) {
        Configuration.db = db;
    }

    public CurrencyTypeEnum getCurrency() {
        return currency;
    }

    public void setCurrency(CurrencyTypeEnum currency) {
        Configuration.currency = currency;
    }

    public LogTypeEnum getLogType() {
        return logType;
    }

    public void setLogType(LogTypeEnum logType) {
        Configuration.logType = logType;
    }
}
