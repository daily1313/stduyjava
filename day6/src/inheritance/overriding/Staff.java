package inheritance.overriding;

public class Staff extends Faculty{
	public String division;
	
	public Staff(String name, long number, String univ,  long idNumber,String division) {
		super(name, number, univ, idNumber);
		this.division = division;
	}
	
	public void printInfo() {
		System.out.print("�̸�: "+super.name+" �ֹι�ȣ: "+super.getSNumber());
		System.out.print("����: "+univ+" ������ȣ: "+super.number);
		System.out.println(" �μ�: "+division);
	}
}
