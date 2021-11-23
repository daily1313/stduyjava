package homework;


public class Car {
	private int maxSpeed;	//�ְ� �ӵ�
	//public int maxSpeed;	//�ְ� �ӵ�
	public String brandName;//�귣���̸�
	public int speed;		//���� �ӵ�

	//�귣�� �̸��� �����ϴ� ������
	public Car(String brandName) {
		this.brandName = brandName;
	}
	//�귣�� �̸��� �ְ� �ӵ��� �����ϴ� ������
	public Car(String brandName, int maxSpeed) {
		this(brandName);
		this.maxSpeed = maxSpeed;
	}
	
	//�ӵ� ���� �޼ҵ�
	public int speedUp() {
		return speed += 30;
	}
	public int speedDown() {
		return speed -= 20;
	}
	
	//maxSpeed�� setter�� getter
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
public static void main(String[] args) {
		Car mycar = new Car("������", 300);
		mycar.speedUp();
		mycar.speedUp();
	System.out.print("����: " + mycar.brandName);
	System.out.print(", �ְ� �ӵ�: " + mycar.maxSpeed);
	System.out.print(", �ְ� �ӵ�: " + mycar.getMaxSpeed());
System.out.println(", ���� �ӵ�: " + mycar.speedDown());
	}
}

