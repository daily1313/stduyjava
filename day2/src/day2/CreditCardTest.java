package day2;

public class CreditCardTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreditCard parkCard = new CreditCard();
		CreditCard leeCard = new CreditCard();
		
		parkCard.owner = "������";
		parkCard.setNumber(2378_7643_7634_9825L);
		leeCard.owner = "�̹���";
		leeCard.setNumber(6456_9876_4521_6838L);
		parkCard.use(100000);
		leeCard.use(15000);
		parkCard.payBill(50000);
		leeCard.payBill(10000);
		System.out.println(parkCard.owner + ": "+parkCard.getNumber());
		System.out.println("ī���� �ܾ�: "+parkCard.getBalance());
		System.out.println("ī������Ʈ: "+parkCard.getPoint());
		System.out.println(leeCard.owner + ": "+leeCard.getNumber());
		System.out.println("ī���� �ܾ�: "+leeCard.getBalance());
		System.out.println("ī������Ʈ: "+leeCard.getPoint());
	}

}
