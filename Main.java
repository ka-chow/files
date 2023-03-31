import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the directory");
        Scanner scan = new Scanner(System.in);
        String newDir = scan.nextLine();
        File file = FileMethod.checkWorkDirectory(newDir);
        if(file != null){
            checkingIfItsFile(file);
        }
    }
    public static void checkingIfItsFile(File f) {
        for (File file1 : f.listFiles()) {
            if (file1.isFile()){
                System.out.println(file1.getAbsolutePath()+ " "+file1.length());
            }else {
                checkingIfItsFile(file1);
            }
        }
    }


}