import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class FileHandling {
    public static void main(String[] args) {
        File f=new File("D:\\logo\\text.txt");
        System.out.println(f.exists());
        System.out.println(f.length());
        try {
            System.out.println(f.createNewFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
        File f1=new File("D:\\logo\\");
        //System.out.println(f1.mkdir());
        //System.out.println(f1.delete());
        System.out.println(Arrays.toString(f1.list()));
        System.out.println(f1.list().length);
        try {
            FileReader fr=new FileReader("D:\\logo\\text.txt");
            int x=fr.read();
            System.out.println(x);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
