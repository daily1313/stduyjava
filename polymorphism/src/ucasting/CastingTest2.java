package ucasting;
class Person{
	String name;
	public Person(String name) {
		this.name =name;
	}
}
class Student extends Person{
	String dept;
	public Student(String name) {
		super(name);
	}
}
public class CastingTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���۷��� student�� �̿��ϸ� name, dept�� ���ٰ���
		Student student = new Student("Madplay");
		// ���۷��� person�� �̿��ϸ� Student��ü�� �����
		// ���� PersonŬ������ ����� ���ٰ���
		
		Person person = student;
		//��ĳ����--�ڽ�Ŭ������ �θ�Ŭ���� Ÿ�Ժ�ȯ
		//�ڽ�Ŭ������ �ʵ� ���� �Ҵ�
		person.name = "Kimtaeng";
		// �Ʒ� ������ ������ Ÿ�� ����
		//person.dept = "Computer Eng"
		System.out.println(person.name);
	}

}
