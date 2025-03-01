public class Print1toNBacktracking {
    public static void main(String[] args) {
        PrintBa(6);
    }

    private static void PrintBa(int n) {
        if(n==0)return;
        PrintBa(n-1);
        System.out.println(n);
    }
}
