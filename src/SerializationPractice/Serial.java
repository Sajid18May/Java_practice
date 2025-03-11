package SerializationPractice;

import java.io.*;

public class Serial{
    public static void main(String[] args) {
        try {
            FileOutputStream fos=new FileOutputStream("D:\\logo\\fos.ser");
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            Serial1 s=new Serial1();
            oos.writeObject(s);
            oos.close();
            fos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
