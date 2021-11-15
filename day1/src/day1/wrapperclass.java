package day1;

public class wrapperclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer year = 1;
		
		switch(year) {
		case 1:
			System.out.println("First year students are not eligible for scholarship");
			break;
		case 2:
			System.out.println("Second year students are not eligible for scholarship");
			break;
		default: System.out.println("Please enter vaild year");
		}
	}

}
