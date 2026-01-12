package JavaPrograms;

public class PrimeOrNot {
    static void main() {
        int num= 77;
        System.out.println(isPrime(num));
    }
    static boolean isPrime(int n) {
        if(n<=1) return false;
        if(n==2) return true;
        if(n%2==0) return false;
        for(int i=3;i*i<=n;i+=2){
            if(n%i==0) return false;
        }
        return true;
    }
}
