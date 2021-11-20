package obj.constructor;

public class Car {
	private int maxSpeed;
	public String brandName;
	public int speed;
	
	public Car(String brandName) {
		this.brandName = brandName;
	}
	public Car(String brandName,int maxSpeed) {
		this(brandName);
		this.maxSpeed = maxSpeed;
	}
	public int SpeedUp() {
		return speed +=30;
	}
	public int SpeedDown() {
		return speed -=20;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car mycar = new Car("포르쉐",300);
		mycar.SpeedUp();
		mycar.SpeedUp();
		System.out.print("차종: "+mycar.brandName);
		System.out.print(", 최고 속도: "+mycar.getMaxSpeed());
		System.out.println(", 현재 속도: "+mycar.SpeedDown());
	}

}
