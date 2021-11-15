package day1;

import java.util.Scanner;

public class Switch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x,y;
		int op;
		Scanner input = new Scanner(System.in);
		System.out.print("두 실수 입력");
		x = input.nextDouble(); y= input.nextDouble();
		System.out.print("번호선택 1(+), 2(-), 3(*), 4(/): ");
		op = input.nextInt();
		
		switch(op) {
		case 1:
			System.out.printf("%.2f + %.2f = %.2f",x,y,x+y);
			break;
		case 2:
			System.out.printf("%.2f - %.2f = %.2f",x,y,x-y);
			break;
		case 3:
			System.out.printf("%.2f * %.2f = %.2f",x,y,x*y);
			break;
		case 4:
			System.out.printf("%.2f / %.2f = %.2f",x,y,x/y);
			break;
		default:
			System.err.printf("연산자 번호를 잘못 입력했습니다. \n");
		}
	}

}
