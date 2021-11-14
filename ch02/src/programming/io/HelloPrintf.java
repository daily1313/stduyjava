package programming.io;

public class HelloPrintf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("123456 123456 123456");
		System.out.println("--------------------");
		System.out.format("%6d %6o %6h %n", 10, 10, 10);
		System.out.format("%-6d %-6o %-6x %n", 20, 20, 20);
		System.out.format("%+6d %6o %6H %n", 30, 30, 30);
		System.out.format("%1$6d %1$6o %1$6h %n",128);
		System.out.printf("%1$6.2f %1$6.3f %1$6.4f",3.141592);
	}

}
