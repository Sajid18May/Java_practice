public class PrintNTimes {
    public static void main(String[] args) {
        printNTimes(1, 7);
    }

    private static void printNTimes(int i, int n) {
        if (i > n) return;
        System.out.println("Hello");
        printNTimes(i + 1, n);
    }
}
