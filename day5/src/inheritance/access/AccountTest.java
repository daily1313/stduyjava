package inheritance.access;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingAccount myAccount = new SavingAccount("°­¹Î°æ",123567834,0.32);
		myAccount.deposit(50000);
		myAccount.withdraw(4000);
		myAccount.checkBalance();
		System.out.println(myAccount.name);
		System.out.println(myAccount.open);
		System.out.println(myAccount.number);
	}

}
