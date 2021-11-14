package programming.basic;
class First{
	public String instancevar = "인스턴스(비정적변수)";
}
public class HelloProgramming2 {

	static String fd = "--필드";
	static String md = "--메소드";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("자바클래스의 구조");
		write(fd);
		write(md);
		First f = new First();
		System.out.println(f.instancevar);
	}
	public static void write(String word) {
		System.out.println(word);
	}

}
