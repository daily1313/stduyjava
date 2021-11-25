package inheritance.abstratinterface;

public class HPPrinter extends Device implements Connectable{
	public void print() {
		System.out.println("HP 프린터입니다.");
	}
	public void connect() {
		System.out.println(name+", HP프린터를 연결합니다.");
	}
	public static void main(String[] args) {
		HPPrinter u = new HPPrinter();
		u.print();
		u.connect();
	}
}
