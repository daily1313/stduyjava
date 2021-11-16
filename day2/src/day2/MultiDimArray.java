package day2;

public class MultiDimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mtrx[][];
		
		mtrx = new int[2][3];
		
		mtrx[0][0] = 3; mtrx[0][1] = 5; mtrx[0][2] = 0;
		mtrx[1][0] = 7; mtrx[1][1] = 2; mtrx[1][2] = 8;
		
		for(int i=0;i<mtrx.length;i++) {
			for(int j=0;j<mtrx[i].length;j++) {
				System.out.print(mtrx[i][j]+" ");
			}
			System.out.println();
		}
	}

}
