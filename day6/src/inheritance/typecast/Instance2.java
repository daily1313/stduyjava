package inheritance.typecast;

public class Instance2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cheese c1 = new Cheese();
		System.out.println(c1 instanceof Food);
		System.out.println(c1 instanceof Cake);
		System.out.println(c1 instanceof Cheese);
	}

}
class Cheese extends Cake{
	String eat() {
		return "eat cheese";
	}
}
class Cake extends Food{
	String eat1() {
		return "eat cake";
	}
}
class Food{
	String eat2() {
		return "eat food";
	}
}
