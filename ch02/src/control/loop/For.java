package control.loop;

public class For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		for(i=1;i<=10;i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		for(int j=1,total =0;j<=5;j++) {
			total += j;
			System.out.printf("1에서 %d까지 합은 %d입니다.%n",j,total);
		}
	}

}
