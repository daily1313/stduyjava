package programming.basic;

public class aaa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int point = 31;
		String str = point % 2==1 ? "홀수": "짝수";
		System.out.printf("%d은 %s다. %n",point, str);
		double x = 6.794, y=6.795;
		double max = (x >y)? x: y;
		System.out.printf("%.2f와 %.2f중에서 %.2f가 더 크다.", x, y, max);


	}

}
