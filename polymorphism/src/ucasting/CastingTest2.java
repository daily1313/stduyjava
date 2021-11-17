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
		//레퍼런스 student를 이용하면 name, dept에 접근가능
		Student student = new Student("Madplay");
		// 레퍼런스 person을 이용하면 Student객체의 멤버중
		// 오직 Person클래스의 멤버만 접근가능
		
		Person person = student;
		//업캐스팅--자식클래스를 부모클래스 타입변환
		//자식클래스의 필드 접근 불능
		person.name = "Kimtaeng";
		// 아래 문장은 컴파일 타임 오류
		//person.dept = "Computer Eng"
		System.out.println(person.name);
	}

}
