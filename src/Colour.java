import java.util.ArrayList;

public class Colour {

	public static void main(String[] args) {
		ArrayList<String> Colorlist = new ArrayList<String>();
		Colorlist.add("White");
		Colorlist.add("Blue");
		Colorlist.add("Red");
		Colorlist.add("Yellow");
		Colorlist.add("Green");

		for (String s : Colorlist) {
			System.out.println(s);
		}

	}

}
