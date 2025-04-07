import java.io.FileReader;

public class ExceptionD {
    public static void main(String[] args) throws Exception {
        ExceptionD e=new ExceptionD();
        e.test1();
        System.out.println(1);
    }
    void test1() throws Exception {
        ExceptionD e=new ExceptionD();
        e.test2();
        System.out.println(2);
    }
    void test2() throws Exception {
        ExceptionD e=new ExceptionD();
        e.test3();
        System.out.println(3);
    }
    void test3() throws Exception {
        FileReader fr=new FileReader("D:\\logo\\text.txt");
        fr.close();
        System.out.println(4);
    }
}
