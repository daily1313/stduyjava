package programming.io;

public class HelloSimpleFPrintf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte age = 27;
		int weight = 70;
		double height = 175.8;
		
		System.out.printf("나이 : %d, 몸무게 : %d, 키 : %6.2f",age,weight,height);
		System.out.printf("%s: %c형","혈액형",'O');
	}

}
