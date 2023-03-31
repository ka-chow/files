import java.io.File;

public class FileMethod {
    public static File checkWorkDirectory(String path){

        File workDir = new File(path);
        if (workDir.exists() && workDir.isDirectory()){
            System.out.println("Scanning "+ workDir);
            return workDir;
        }else {
            System.out.println("Error");
            return null;
        }
    }


}
