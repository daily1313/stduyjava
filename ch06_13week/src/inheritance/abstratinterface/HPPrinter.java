package inheritance.abstratinterface;

public class HPPrinter extends Device implements Connectable{
	public void print() {
		System.out.println("HP �������Դϴ�.");
	}
	public void connect() {
		System.out.println(name+", HP�����͸� �����մϴ�.");
	}
	public static void main(String[] args) {
		HPPrinter u = new HPPrinter();
		u.print();
		u.connect();
	}
}
