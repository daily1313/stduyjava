package inheritance.overriding;

public class Staff extends Faculty{
	public String division;
	
	public Staff(String name, long number, String univ,  long idNumber,String division) {
		super(name, number, univ, idNumber);
		this.division = division;
	}
	
	public void printInfo() {
		System.out.print("이름: "+super.name+" 주민번호: "+super.getSNumber());
		System.out.print("대학: "+univ+" 직원번호: "+super.number);
		System.out.println(" 부서: "+division);
	}
}
