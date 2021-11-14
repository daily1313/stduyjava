package programming.io;

public class HelloInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("이름과 학번을 입력하세요.");
		String name = input.next();
		int num = input.nextInt();
		System.out.println("이름: "+name+", 학번:"+num);
		
	}

}
