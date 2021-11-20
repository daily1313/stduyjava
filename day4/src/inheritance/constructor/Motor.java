package inheritance.constructor;

class Vehicle{
	public String name = "차량";
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
	public String name = "자동차";
	public int displacement;
	
	public Motor(double maxSpeed,int seater,int displacement) {
		super(maxSpeed,seater);
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
		Motor myCar = new Motor(300,4,5000);
		myCar.printInfo();
	}

}
