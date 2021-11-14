package operator;

public class DevideByZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short data1 = 32766;
		short data2 = 1;
		// short data3 = data1 + data2(¿À·ù);
		short data3 = (short)(data1+data2);
		short data4 = 32766+1;
		System.out.println(data3+" "+data4);
		
		System.out.println(0.0 / 0.0);
		System.out.println(3 / 0.0);
		System.out.println(3 / 0);
	}

}
