package inheritance.typecast;
class Person6{
	String teach() {
		return "teach basics";
	}
}
class Faculty6 extends Person6{
	String teach1() {
		return "teach majors";
	}
}
public class downcast5 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person6 p = new Faculty6(); // ��ĳ���� ����
		System.out.println(p instanceof Person6);
		Faculty6 p6 = (Faculty6) p; // �ٿ�ĳ����
		System.out.println(p6 instanceof Person6);
		
		System.out.println(p6.teach1());
	}

}
