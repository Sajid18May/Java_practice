public class Pattern1 {
    public static void main(String[] args){
        //1
        //22
        //333
        //4444
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println(" ");
        }
        //1
        //12
        //123
        //1234

        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }
        //*
        //**
        //***
        //****
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
