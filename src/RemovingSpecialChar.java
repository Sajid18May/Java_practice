public class RemovingSpecialChar {
    public static void main(String[] args) {
        String s="Hi &*(@$&@)($@ it's %(# day 9 (*)(&)(&)*&";
        String noSpecial=s.replaceAll("[^a-zA-Z0-9 ']","");
        System.out.println(noSpecial);
    }
}
