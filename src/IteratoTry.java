import java.util.ArrayList;
import java.util.Iterator;

public class IteratoTry {
    public static void main(String[] args) {
        ArrayList<Integer > ls=new ArrayList<>();
        ls.add(1);
        ls.add(34);
        ls.add(5);
        Iterator<Integer> vals=ls.iterator();
        while (vals.hasNext()){
            System.out.println(vals.next());
        }
    }

}
