package inheritance.basic;
class Vehicle{
	public String name = "차량";
	public double maxSpeed;
	public int seater;
}
public class Motor extends Vehicle{
	public String name = "자동차";
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
		System.out.println(", 최대속도: "+maxSpeed+" Km");
		System.out.print("정원: "+seater+" 명");
		System.out.println(", 배기량: "+displacement+" cc");
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
