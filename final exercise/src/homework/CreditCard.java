package homework;

public class CreditCard {
	private long number;	//16�ڸ� ī���ȣ
	public String owner;	//ī�� ������

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CreditCard myCard = new CreditCard();
			
		myCard.number= 3456_7654_8765_5647L;
		myCard.owner= "�� �缮";
			System.out.print("ī���ȣ: " +myCard.number);
			System.out.println(", ī�������: " + myCard.owner);

	}

}
