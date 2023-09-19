
public class String_Assignment_2 {

	public static void main(String[] args) {
		//1
		StringBuffer sb=new StringBuffer();
		sb.append("This is StringBuffer");
		//2
		sb.append("- This is a sample program");
		System.out.println(sb);
		//3
		sb.insert(20, "Object");
		System.out.println(sb);
		//4
		StringBuffer sbTemp=new StringBuffer();
		sbTemp.append(sb);
		sb.reverse();
		System.out.println(sb);
		//5
		sbTemp.replace(14,20,"Builder");
		System.out.println(sbTemp);
	}

}
