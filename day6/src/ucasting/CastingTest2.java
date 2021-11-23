package ucasting;
class Person{
	String name;
	public Person(String name) {
		this.name = name;
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
		Student student = new Student("Madplay");
		Person person = student;
		person.name = "Kimtaeng";
		System.out.println(person.name);
	}

}
