package app.logger;

import app.utils.Utils;

import java.io.*;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class FileLogger implements BaseLogger {
    public String path;
    public String globalPath = "C:/java/loggerFile.log";
    public String localPath = "loggerFile.log";

    public FileLogger() {
        this.path = this.localPath;
    }

    public FileLogger(String path) {
        this.path = path;
    }

    public void removeFile() {
        new File(this.path).delete();
    }

    public void log(String data) {
        try (FileWriter fw = new FileWriter(this.path, true);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter out = new PrintWriter(bw)) {
            out.println(data);
            //more code
        } catch (IOException e) {
            //exception handling left as an exercise for the reader
        }
    }

    public void log2(String data) {
        Utils.print("File logger: " + data);

        Logger logger = Logger.getLogger("MyLog");
        FileHandler fh;

        try {
            // This block configure the logger with handler and formatter
            fh = new FileHandler(this.path);
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);

            // the following statement is used to log any messages
            logger.info(data);

        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
