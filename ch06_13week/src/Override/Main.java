package Override;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank = new KBBank();
		bank.withDraw(100);
		bank.deposit(100);
		System.out.println(bank.findDormancyAccount("763231"));
		Bank.BCAuth("KBBank");
		System.out.println("\n인스턴스 교체!!\n");
	}

}
