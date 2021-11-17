package inheritance.typecast;

public class Fruit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit f = new Fruit();
		System.out.println(f instanceof Fruit);
		System.out.println(f instanceof Apple);
		System.out.println(f instanceof Grape);
		Fruit fa = new Apple();
		System.out.println(fa instanceof Fruit);
		System.out.println(fa instanceof Apple);
		System.out.println(fa instanceof Pear);
		Apple a = new Apple();
		System.out.println(a instanceof Fruit);
		System.out.println(a instanceof Apple);
	}

}
class Apple extends Fruit{
}
class Pear extends Fruit{
}
class Grape extends Fruit{
}