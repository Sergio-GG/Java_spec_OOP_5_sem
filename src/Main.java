import java.io.*;

public class Main {
    public static void main(String[] args){

    createBackup(".");

    }

    public static void createBackup(String path) {
        File file = new File(path);
        File[] files = file.listFiles();
        try{
            FileOutputStream fos = new FileOutputStream("./backup");
            PrintWriter pr = new PrintWriter(fos);
            for (File f: files) {
                pr.println(f);
            }
            pr.close();
            fos.close();
        }catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}