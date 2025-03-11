package SerializationPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Serial2 {
    public static void main(String[] args) {
        try {
            FileInputStream fis=new FileInputStream("D:\\logo\\fos.ser");
            ObjectInputStream ois=new ObjectInputStream(fis);
            Serial1 x=(Serial1)ois.readObject();
            System.out.println(x.a);
            System.out.println(x.b);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
