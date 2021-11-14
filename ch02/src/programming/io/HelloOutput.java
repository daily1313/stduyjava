package programming.io;

import java.util.Scanner;

public class HelloOutput {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  input = new Scanner(System.in);
		System.out.println("십진수와 이진수를 각각 입력하세요.");
		int num1 = input.nextInt();
		int num2 = input.nextInt(2);
		System.out.println("num1="+num1+" num2 ="+num2);
		System.out.printf("num1=%d,num2=%d",num1,num2);
	}

}
