package day2;

public class CreditCard {
	private long number;
	public String owner;
	private int point;
	private int balance;
	
	public void use(int amount) {
		balance += amount;
		System.out.println("���� ī�� ����: "+balance);
	}
	public void payBill(int amount) {
		balance -= amount;
		System.out.println(owner + " ���Ҿ�: "+ amount +", ���� �ܾ�: "+balance);
		addPoint(amount);
	}
	private void addPoint(int amount) {
		point += amount/1000;
		System.out.println(owner +" ���ʽ� ����Ʈ: "+point);
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreditCard myCard = new CreditCard();
		
		myCard.number = 3456_7654_8765_5647L;
		myCard.owner = "�̼���";
		System.out.print("ī���ȣ: "+myCard.number);
		System.out.println(", ī�������: "+myCard.owner);
		myCard.use(30000);
		myCard.payBill(10000);
		
	}

}
