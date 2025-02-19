public class Print1To5 {
    public static void main(String[] args) {
        printNumber(5);
        printNumberRev(5);
    }

    private static void printNumber(int i) {
        if(i==0){
            return;
        }
        System.out.println(i);
        printNumber(i-1);
    }
    private static void printNumberRev(int i) {
        if(i==0){
            return;
        }
        printNumberRev(i-1);
        System.out.println(i);
    }
}
