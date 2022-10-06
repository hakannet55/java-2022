package kodlamaio.utils;

import kodlamaio.bussines.LoggerManager;

public class Tool {
        public static void print(int str) {
            System.out.println(str);
        }
    public static void print(double str) {
        System.out.println(str);
    }
        public static void print(String str) {
            System.out.println(str);
            new LoggerManager().log(str);
        }

    }
