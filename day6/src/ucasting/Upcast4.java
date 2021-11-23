package ucasting;
class Person5{
	String teach() {
		return "teach basics";
	}
}
class Faculty5 extends Person5{
	String teach1() {
		return "teach major";
	}
}
public class Upcast4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Faculty5 f =new Faculty5();
		Person5 p5 =f;
		System.out.println(p5.teach());
		Person5 p = new Faculty5();
		Faculty5 p6 = (Faculty5) p;
		System.out.println(p6.teach1());
		System.out.println(p6.teach());
	}

}
