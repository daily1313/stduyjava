package inheritance.abstratinterface;

public class Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape r = new Rectangle(2,3,3.67,7.89);
		Shape c = new Circle(3,4,4.82);
		r.draw();
		c.draw();
		
		Shape sa[] = {new Rectangle(2.5,3.1,1.67,3.89), new Circle(4.2,3.8,1.56)};
		sa[0].draw();
		sa[1].draw();
	}

}
