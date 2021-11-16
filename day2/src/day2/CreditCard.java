package day2;

public class CreditCard {
	private long number;
	public String owner;
	private int point;
	private int balance;
	
	public void use(int amount) {
		balance += amount;
		System.out.println("현재 카드 사용액: "+balance);
	}
	public void payBill(int amount) {
		balance -= amount;
		System.out.println(owner + " 지불액: "+ amount +", 지불 잔액: "+balance);
		addPoint(amount);
	}
	private void addPoint(int amount) {
		point += amount/1000;
		System.out.println(owner +" 보너스 포인트: "+point);
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
		myCard.owner = "이수강";
		System.out.print("카드번호: "+myCard.number);
		System.out.println(", 카드소유자: "+myCard.owner);
		myCard.use(30000);
		myCard.payBill(10000);
		
	}

}
