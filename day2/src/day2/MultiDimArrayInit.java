package day2;

public class MultiDimArrayInit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ragAry1[][] = new int[2][];
		
		ragAry1[0] = new int[2];
		ragAry1[1] = new int[3];
		
		ragAry1[0][0] = 4; ragAry1[0][1] = 2;
		ragAry1[1][0] = 7; ragAry1[1][1] = 3; ragAry1[1][2] = 6;
		
		System.out.print(ragAry1.length+", ");
		System.out.print(ragAry1[0].length+" ");
		System.out.println(ragAry1[1].length+" ");
		
		int ragAry2[][] = {{2,3},{3,6,9},{4,5,7,8}};
		System.out.print(ragAry2.length+", ");
		System.out.print(ragAry2[0].length+" ");
		System.out.print(ragAry2[1].length+" ");
		System.out.println(ragAry2[2].length);
		
		for(int i=0;i<ragAry2.length;i++) {
			for(int j=0;j<ragAry2[i].length;j++) {
				System.out.print(ragAry2[i][j] + " ");
			}
			System.out.println();
		}
	}

}
