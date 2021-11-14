package programming.io;

public class HelloStdIO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("정수와 실수를 각각 입력하세요.");
		int i = input.nextInt();
		double d = input.nextDouble();
		System.out.println("i="+i+", d="+d);
		System.err.println("에러는 없습니다.");
	}

}
