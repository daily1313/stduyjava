package obj.field;


public class Circle {
	public double radius;
	public static final double PI = 3.141592;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	public double getArea() {
		return radius * radius * PI;
	}
	public double getCircumference() {
		return 2*PI*radius;
	}
	public void print() {
		System.out.printf("�������� %.2f�� ���� ������ %.2f�̰�,",radius,getArea());
		System.out.printf(" �ѷ� ���̴� %.2f�̴�. %n",getCircumference());
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle(2.78);
		c1.print();
		Circle c2 = new Circle(5.25);
		c2.print();
	}

}
