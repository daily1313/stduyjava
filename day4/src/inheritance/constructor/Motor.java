package inheritance.constructor;

class Vehicle{
	public String name = "����";
	public double maxSpeed;
	public int seater;
	public Vehicle() {
		
	}
	public Vehicle(double maxSpeed, int seater) {
		this.maxSpeed = maxSpeed;
		this.seater = seater;
	}
}
public class Motor extends Vehicle{
	public String name = "�ڵ���";
	public int displacement;
	
	public Motor(double maxSpeed,int seater,int displacement) {
		super(maxSpeed,seater);
		this.displacement = displacement;
	}
	public void printInfo() {
		System.out.print(super.name+": "+ this.name);
		System.out.println(", �ִ�ӵ�: "+maxSpeed+" Km");
		System.out.print("����: "+seater+" ��");
		System.out.println(", ��ⷮ: "+displacement+" cc");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Motor myCar = new Motor(300,4,5000);
		myCar.printInfo();
	}

}
