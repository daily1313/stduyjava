package day2;

public class Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		for(i=1;i<=10;i++) {
			if(i%3==0) continue;
			System.out.print(i+" ");
		}
		System.out.println();
	}

}
