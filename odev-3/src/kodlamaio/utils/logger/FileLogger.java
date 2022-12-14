package kodlamaio.utils.logger;

import kodlamaio.utils.Tool;

import java.io.*;

public class FileLogger implements IBaseLogger {
    public String path;
    public String globalPath = "C:/java/loggerFile.log";
    public String localPath = "loggerFile.log";

    public FileLogger() {
        this.path = this.globalPath;
    }

    public FileLogger(String path) {
        this.path = path;
    }

    public void removeFile() {
        new File(this.path).delete();
    }

    @Override
    public void log(String message) {
        //Tool.print("File Log: " + message);
        System.out.println("loggedFile:"+ message);
        try {
            FileWriter fw = new FileWriter(this.path, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw);
            out.println(message);
            //more code
        } catch (IOException e) {
            //exception handling left as an exercise for the reader
        }
    }
}
