package inheritance.typecast;

public class Downcasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person she = new Person("�̼Ҷ�",2056432);
		System.out.println(she.name + " "+she.number);
		Person p = new Staff("����",1187543,"�������б�",3456);
		
		Staff s = (Staff) p;
		s.division = "����ó";
		System.out.print(p.name+" "+p.number+" ");
		System.out.print(s.univ+" "+s.number+" ");
		System.out.println(s.division);
	}

}
