package day2;

public class For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		for(i=1;i<=10;i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		int sum=0;
		for(i=1,sum=0;i<=10;sum+=i,i++);
		System.out.printf("합: %d%n",sum);
		for(int j=1,total = 0;j<=5;j++) {
			total +=j;
			System.out.printf("1에서 %d까지의 합은 %d입니다.\n",j,total);
		}
	}

}
