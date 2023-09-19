
public class MainClass1 {
	public static void main(String[] args) {
		try {
			int a[] = new int[11];
			try {
				a[11]=56;
				try {
					String s="hello";
					int z=Integer.parseInt(s);
				}
				  catch (Exception e) {
						System.out.println(e);
					}
			}
			  catch (Exception e) {
					System.out.println(e);
				}
		}

         catch (Exception e) {
			System.out.println(e);
		}

		finally {
			System.out.println("Exit...");
		}
	}
}