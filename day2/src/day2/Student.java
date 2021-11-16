package day2;

public class Student {
	public String name;
	
	public Student() {
		
	}
	public Student(String name) {
		this.name = name;
	}
	public void print() {
		System.out.println("ÇĞ»ıÀÌ¸§: "+this.name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student lee = new Student("ÀÌ½ÂÈÆ");
		lee.print();
		Student kim = new Student();
		kim.name = "±è´Ùºó";
		kim.print();
	}

}
