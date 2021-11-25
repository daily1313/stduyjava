package inheritance.abstratinterface;

public class USBMemory extends Device implements Connectable{
	public void print() {
		System.out.println("삼성 USB 메모리입니다.");
	}
	public void connect() {
		System.out.println(name+", USB 메모리를 연결합니다.");
	}
	public static void main(String[] args) {
		Device u = new USBMemory();
		u.print();
		((Connectable)u).connect();
	}
}
