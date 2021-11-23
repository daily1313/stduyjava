package inheritance.typecast;

public class Downcasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person she = new Person("이소라",2056432);
		System.out.println(she.name + " "+she.number);
		Person p = new Staff("김상기",1187543,"강서대학교",3456);
		
		Staff s = (Staff) p;
		s.division = "교학처";
		System.out.print(p.name+" "+p.number+" ");
		System.out.print(s.univ+" "+s.number+" ");
		System.out.println(s.division);
	}

}
