package programming.basic2;
class First{
	public String instancevar="�ν��Ͻ�(������ ����)";
	public void instanceMethod() {
		System.out.println("�ν��Ͻ� �޼ҵ�");
	}
}
public class HelloProgramming3 {
	static String fd = "--�ʵ�";
	static String md = "--�޼ҵ�";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�ڹ�Ŭ������ ����");
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
