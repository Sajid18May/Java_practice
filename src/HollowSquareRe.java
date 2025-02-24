
public class HollowSquareRe {
public static void main(String[] args) {
	int row=5;
	hollowPattern(row,row);
}

private static void hollowPattern(int row, int col) {
	if(row==0)
		return;
	if(col>=1) {
		if(col==1 || col==5 || row==1 ||row==5)
			System.out.print("*");
		else
			System.out.print(" ");
		hollowPattern(row, col-1);
	}
	else {
		col=5;
		System.out.println();
		hollowPattern(row-1, col);
	}
	
	
}


}
