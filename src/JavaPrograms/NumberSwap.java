package JavaPrograms;

public class NumberSwap {
    static void main() {
        int num1=12,num2=34;
        System.out.println(swapNumber(num1,num2));
    }
    static String swapNumber(int num1,int num2){
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        return ("After swap: num1 = " + num1 + ", num2 = " + num2);
    }
}
