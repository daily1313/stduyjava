package inheritance.overriding;

public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person she = new Person("�̼Ҷ�",2056432);
		she.printInfo();
		
		Person i = new Faculty("�迵��",1145782,"���Ѵ��б�",38764);
		i.printInfo();
		Person he = new Staff("�ֿ���",1167429,"�������б�",1287,"��ȹó");
		he.printInfo();
		Faculty f = (Faculty) he;
		f.printInfo();
		Staff s = (Staff) he;
		s.printInfo();
	}

}
