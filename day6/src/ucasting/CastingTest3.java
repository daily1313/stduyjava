package ucasting;
class Person2{
	String name;
	public Person2(String name) {
		this.name =name;
	}
}
class Student2 extends Person2{
	String dept;
	public Student2(String name) {
		super(name);
	}
}
public class CastingTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person2 person2 = new Student2("Madplay");
		Student2 student2 = (Student2) person2;
		student2.name = "Kimtaeng";
		student2.dept = "Computer Eng";
	}

}
