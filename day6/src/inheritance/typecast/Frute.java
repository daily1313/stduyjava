package inheritance.typecast;

public class Frute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frute f = new Frute();
		System.out.println(f instanceof Frute);
		System.out.println(f instanceof Apple);
		System.out.println(f instanceof Grape);
		Frute fa = new Apple();
		System.out.println(fa instanceof Frute);
		System.out.println(fa instanceof Apple);
		System.out.println(fa instanceof Pear);
		Apple a = new Apple();
		System.out.println(a instanceof Frute);
		System.out.println(a instanceof Apple);
	}

}
class Apple extends Frute{}
class Pear extends Frute{}
class Grape extends Frute{}
