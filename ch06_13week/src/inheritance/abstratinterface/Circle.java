package inheritance.abstratinterface;

public class Circle extends Shape{
	double radius;
	public Circle(double x,double y,double radius) {
		super(x,y);
		this.radius = radius;
	}
	public void draw() {
		super.drawCenter();
		System.out.printf("반지름: %f,",radius);
		System.out.printf("원 면적: %f\n",radius*radius*Math.PI);
	}
}
