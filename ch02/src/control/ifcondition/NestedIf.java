package control.ifcondition;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("������� �������� (1[1��] �Ǵ� 2[2��] �Է�)>>");
		int type = in.nextInt();
		System.out.print("�ʱ� ������� ���� �Է� >>");
		int score = in.nextInt();
		
		if(type == 1) {
			if(score>=70)
				System.out.println("1�� ���� ���� �հ�");
			else 
				System.out.println("1�� ���� ���� ���հ�");
		}
		else if(type == 2) {
			if(score>=60)
				System.out.println("2�� ���� ���� �հ�");
			else 
				System.out.println("2�� ���� ���� ���հ�");
		}
	}

}