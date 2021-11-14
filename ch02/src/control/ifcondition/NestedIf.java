package control.ifcondition;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("면허시험 종류선택 (1[1종] 또는 2[2종] 입력)>>");
		int type = in.nextInt();
		System.out.print("필기 면허시험 점수 입력 >>");
		int score = in.nextInt();
		
		if(type == 1) {
			if(score>=70)
				System.out.println("1종 면허 시험 합격");
			else 
				System.out.println("1종 면허 시험 불합격");
		}
		else if(type == 2) {
			if(score>=60)
				System.out.println("2종 면허 시험 합격");
			else 
				System.out.println("2종 면허 시험 불합격");
		}
	}

}
