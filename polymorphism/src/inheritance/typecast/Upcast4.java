package inheritance.typecast;
class Person5{
	String teach() {
		return "teach basics";
	}
}
class Faculty5 extends Person5{
	String teach1() {
		return "tecah majors";
	}
}
public class Upcast4 {
	public static void main(String[] args) {
		Faculty5 f = new Faculty5(); // 자식객체생성
		Person5 p5 = f;// 업캐스팅
		System.out.println(p5 instanceof Faculty5);
		System.out.println(p5.teach());
	}
}
