
public class SquareRecursion {
public static void main(String[] args) {
	int row=5;
	int col=5;
	pattren2(row,col);
}

private static void pattren2(int row, int col) {
	if(row==0)
		return;
	if(col>0) {
		System.out.print("*");
		pattren2(row,col-1);
	}
	else {
		System.out.println();
		pattren2(row-1,5);
		}
	
}
}
