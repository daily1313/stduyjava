package inheritance.abstratinterface;

public class USBMemory extends Device implements Connectable{
	public void print() {
		System.out.println("�Ｚ USB �޸��Դϴ�.");
	}
	public void connect() {
		System.out.println(name+", USB �޸𸮸� �����մϴ�.");
	}
	public static void main(String[] args) {
		Device u = new USBMemory();
		u.print();
		((Connectable)u).connect();
	}
}
