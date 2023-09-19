
public class String_Assignment_1 {

	public static void main(String[] args) {
		String S="Welcome to Java World";
		//1
		System.out.println(S.charAt(4));
		//2
		System.out.println(S.compareTo("Welcome"));
		//3
		System.out.println(S+"- Let us learn");
		//4
		System.out.print("'a' present at ");
		for(int i=0;i<S.length();i++) {
			if(S.charAt(i)=='a') {
				System.out.print(i+" ");
			}
		}
		//5
		StringBuilder s1=new StringBuilder();
		s1.append(S);
		for(int i=0;i<S.length();i++) {
			if(S.charAt(i)=='a') { 
				s1.setCharAt(i,'e');
			}
		}
		System.out.println(s1);
		//6
		String s2=S.substring(4, 9);
		System.out.println(s2);
		//7
		System.out.println(S.toLowerCase());

	}

}
