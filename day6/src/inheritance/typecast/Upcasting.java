package inheritance.typecast;

public class Upcasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person she = new Person("이소라",2056432);
		System.out.println(she.name + " "+ she.number);
		
		Faculty f = new Faculty("김영태",1145782,"연한대학교",38764);
		Person p = f;
		System.out.print(p.name+" "+p.number+" ");
		System.out.println(f.name+" "+((Person) f).number);
		System.out.println(f.univ+" "+f.number);
		Staff s = new Staff("김상기",1187543,"강서대학교",3456);
		s.division = "교학처";
		Person pn = s;
		Faculty ft = s;
		System.out.print(pn.name+" "+pn.number+" ");
		System.out.print(ft.univ+" "+ft.number+" ");
		System.out.println(s.division);
	}

}
