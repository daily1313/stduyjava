package inheritance.typecast;

public class Instanceof {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person she = new Person("�̼Ҷ�",2056432);
		if(she instanceof Staff) {
			Staff st1 = (Staff) she;
		}
		else {
			System.out.println("she�� Staff�� ��ü�� �ƴմϴ�.");
		}
		Person p = new Staff("����",1187543,"�������б�",3456);
		if(p instanceof Staff) {
			System.out.println("p�� Staff�� ��ü�Դϴ�. ");
			Staff st2 = (Staff) p;
		}
	}

}
