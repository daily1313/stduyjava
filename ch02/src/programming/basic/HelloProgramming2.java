package programming.basic;
class First{
	public String instancevar = "�ν��Ͻ�(����������)";
}
public class HelloProgramming2 {

	static String fd = "--�ʵ�";
	static String md = "--�޼ҵ�";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�ڹ�Ŭ������ ����");
		write(fd);
		write(md);
		First f = new First();
		System.out.println(f.instancevar);
	}
	public static void write(String word) {
		System.out.println(word);
	}

}
