package homework;

public class CreditCard {
	private long number;	//16자리 카드번호
	public String owner;	//카드 소유자

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CreditCard myCard = new CreditCard();
			
		myCard.number= 3456_7654_8765_5647L;
		myCard.owner= "유 재석";
			System.out.print("카드번호: " +myCard.number);
			System.out.println(", 카드소유자: " + myCard.owner);

	}

}
