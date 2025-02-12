public class DuckNumber {
    public static void main(String[] args) {
        int num=1560;
        boolean duck=false;
        while(num>0){
            if(num%10==0){
                duck=true;
                break;
            }
            num/=10;
        }
        if(duck)
            System.out.println("It's DuckNumber");
        else
            System.out.println("It's Not a DuckNumber");
    }
}
