
public class PlusOne {
        public int[] plusOne(int[] digits) {
            int a=1+digits[digits.length-1];
            if(a<9)
            {
               digits[digits.length-1]=a;
               return digits;
             }
             else {

                int[] dig2 = new int[digits.length + 1];
                for (int i = 0; i < dig2.length - 1; i++) {
                    dig2[i] = digits[i];
                }
                dig2[dig2.length - 2] = 1;
                dig2[dig2.length - 1] = 0;
                return dig2;
            }
        }

    public static void main(String[] args) {
        PlusOne p=new PlusOne();
        int[] n={4,9,9,9,9,9};
        int[] sol=p.plusOne(n);
        for (int i:sol
             ) {
            System.out.println(i);
        }
    }


}

