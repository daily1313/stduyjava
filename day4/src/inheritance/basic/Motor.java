package inheritance.basic;
class Vehicle{
	public String name = "����";
	public double maxSpeed;
	public int seater;
}
public class Motor extends Vehicle{
	public String name = "�ڵ���";
	public int displacement;
	
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public void setSeater(int seater) {
		this.seater = seater;
	}
	public void setDisplacement(int displacement) {
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
		Motor myCar = new Motor();
		myCar.maxSpeed = 160;
		myCar.seater = 5;
		myCar.displacement = 1500;
		myCar.printInfo();
	}

}
