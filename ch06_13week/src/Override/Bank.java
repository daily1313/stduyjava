package Override;

public interface Bank {
	public int MAX_INTEGER = 1000000;
	void withDraw(int price);
	void deposit(int price);
	default String findDormancyAccount(String custId) {
		System.out.println("**������������ 00���� ���� �޸���� ã���ֱ� �");
		System.out.println("**�������������� �����ϴ� ����**");
		return "00���� 000-000-0000-00";
	}
	static void BCAuth(String bankName) {
		System.out.println(bankName+" ���� ���ü�� ������ ��û�մϴ�.");
		System.out.println("�� ������ ���� ���ü�� ���� ����");
	}
}
