public class LargestPrefix {
    static void main() {
        String[] arr={"sajid","saji","saj"};
        System.out.println(longestPrefix(arr));
    }

    private static String longestPrefix(String[] arr){
        StringBuilder prefix= new StringBuilder("");

        if(arr.length==0 || arr[0].length()<=1)
            return prefix.toString();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr[arr.length-1].length(); j++) {
                if(arr[i].charAt(j)==arr[i].charAt(j+1)){
                    prefix.append(arr[i].charAt(j));
                }
                else
                    break;

            }
        }
        return prefix.toString();
    }
}
