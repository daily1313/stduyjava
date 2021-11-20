package inheritance.access;
import java.util.Date;

class Account{
	public String name;
	protected Date open;
	int number;
	private long balance;
	
	protected Account(String name, int number) {
		this.name = name;
		this.number = number;
		this.open = new Date();
	}
	public long deposit(long amount) {
		return balance += amount;
	}
	public long withdraw(long amount) {
		return balance -= amount;	
	}
	public long checkBalance() {
		System.out.println(name+": °èÁÂ¹øÈ£"+number+", ÀÜ¾×"+balance);
		return balance;
	}
}
public class SavingAccount extends Account{
	public double rates;
	public SavingAccount(String name, int number,double rates) {
		super(name,number);
		this.rates = rates;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingAccount myAccount = new SavingAccount("±èÅÂÈñ",234567654,0.34);
		myAccount.deposit(400000);
		myAccount.withdraw(50000);
		myAccount.checkBalance();
		System.out.println(myAccount.name);
		System.out.println(myAccount.open);
		System.out.println(myAccount.number);
	}

}
