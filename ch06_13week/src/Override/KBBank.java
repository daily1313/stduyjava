package Override;

public class KBBank implements Bank{
	public void withDraw(int price) {
		System.out.print("KB���ุ�� ���� ����...");
		if(price<Bank.MAX_INTEGER) {
			System.out.println(price+" ���� �����Ѵ�.");
		}else {
			System.out.println(price+" ���� �������");
		}
	}
	public void deposit(int price) {
		System.out.println("KB���ุ�� �Ա� ����..."+price+" ���� �Ա��Ѵ�.");
	}
	

}
