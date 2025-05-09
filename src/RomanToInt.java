import java.util.HashMap;

public class RomanToInt {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(romanToIntOP(s));
        System.out.println(romanToInt(s));
    }
    public static int romanToIntOP(String s){
        int currentValue=0;
        int nextValue=0;
        int[] values=new int[256];
        values['I']=1;
        values['V']=5;
        values['X']=10;
        values['L']=50;
        values['C']=100;
        values['D']=500;
        values['M']=1000;
        int sum=0;
        for(int i=s.length()-1;i>=0;i--){
            currentValue=values[s.charAt(i)];
            if(currentValue<nextValue){
                sum=sum-currentValue;
            }else{
                sum+=currentValue;
            }
            nextValue=currentValue;
        }
        return sum;
    }
    public static int romanToInt(String s){
        HashMap<Character,Integer> ref=new HashMap<>();
        ref.put('I',1);
        ref.put('V',5);
        ref.put('X',10);
        ref.put('L',50);
        ref.put('C',100);
        ref.put('D',500);
        ref.put('M',1000);
        int r=ref.get(s.charAt(s.length()-1));
        for(int i=s.length()-2;i>=0;i--)
        {
            Character m=s.charAt(i);
            if(ref.get(m)<ref.get(s.charAt(i+1)))
            {
                r-=ref.get(m);
            }
            else
                r+=ref.get(m);
        }

        return r;
    }
}
