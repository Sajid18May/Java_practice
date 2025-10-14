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
            boolean match=true;
            char current =arr[0].charAt(i);
            for (int j = 1; j < arr.length-1; j++) {
                if(i > arr[arr.length-1].length() || current != arr[j].charAt(i)){
                    match=false;
                    break;
                }
            }
            if(match)
                prefix.append(arr[i].charAt(i));
            else
                break;
        }
        return prefix.toString();
    }
}
