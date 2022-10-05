package app.utils;

import app.logger.BaseLogger;

import java.util.List;

public class Utils {
    public static void print(int str) {
        System.out.println(str);
    }

    public static void print(String str) {
        System.out.println(str);
    }

    public static void addLog(List<BaseLogger> loggers, String msg) {
        // multiple log
        for (BaseLogger logger : loggers) {
            logger.log(msg);
        }
    }

    public static void addLog(BaseLogger logger, String msg) {
        logger.log(msg);
    }
}
