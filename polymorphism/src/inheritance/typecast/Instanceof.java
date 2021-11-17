package inheritance.typecast;

public class Instanceof {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person she = new Person("이소라",2056432);
		if(she instanceof Staff) {
			Staff st1 = (Staff) she;
		}
		else {
			System.out.println("she는 Staff의 객체가 아닙니다.");
		}
		Person p = new Staff("김상기",1187543,"강서대학교",3456);
		if(p instanceof Staff) {
			System.out.println("p는 Staff의 객체입니다. ");
			Staff st2 = (Staff) p;
		}
	}

}
