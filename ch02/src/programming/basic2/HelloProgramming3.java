package programming.basic2;
class First{
	public String instancevar="인스턴스(비정적 변수)";
	public void instanceMethod() {
		System.out.println("인스턴스 메소드");
	}
}
public class HelloProgramming3 {
	static String fd = "--필드";
	static String md = "--메소드";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("자바클래스의 구조");
		write(fd);
		write(md);
		First f = new First();
		System.out.println(f.instancevar);
		f.instanceMethod();
	}
	public static void write(String word) {
		System.out.println(word);
	}

}
