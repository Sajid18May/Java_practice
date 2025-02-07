public class pat {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for (int j=1;j<=i;j++){
                System.out.print((i*(i-1)/2+j));
            }
            System.out.println();
        }
        //(i*(i-1)/2+j)
/*
1
23
456
78910
1112131415
*/
        for(int i=1;i<=5;i++){
            for (int j=5-1;j>=i;j--){
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        /*

         *
        * *
       * * *
      * * * *
     * * * * *

         */
        for(int i=1;i<=5;i++){
            for (int j=5-1;j>=i;j--){
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                if (k==1||k==i)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        for(int i=4;i>=1;i--){
            for (int j=4-i;j>=0;j--){
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                if (k==1||k==i)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

    }
}
