package day1;

import java.util.Scanner;

public class Switch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("년의 월(month)를 입력: ");
		int month = input.nextInt();
		
		switch(month) {
		case 1:
		case 2:
		case 3:
			System.out.printf("%d월 1분기입니다. \n",month);
			break;
		case 4: case 5: case 6:
			System.out.printf("%d월은 2분기입니다. \n",month);
			break;
		case 7: case 8: case 9:
			System.out.printf("%d월은 3분기입니다. \n",month);
			break;
		case 10: case 11: case 12:
			System.out.printf("%d월은 4분기입니다. \n",month);
			break;
		default:
			System.err.printf("월(month)을 잘못 입력하셨습니다.\n");
		}
	}

}
