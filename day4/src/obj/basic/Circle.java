package obj.basic;

public class Circle {

	public double radius;
	public static double PI = 3.141592;
	public Circle(double radius) {
		this.radius = radius;
	}
	public double getArea() {
		return radius * radius * 3.14;
	}
	public void print() {
		System.out.printf("반지름이 %f인 원의 면적은 %f이다. %n",radius,getArea());
	}
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.out.println("원주율: "+Circle.PI);
		Circle c1 = new Circle(2.78);
		c1.print();
		Circle c2 = new Circle(5.25);
		c2.print();
		c1.PI = 3.14159265;
		System.out.println("원주율: "+c2.PI);
	}

}
