package operator;

public class LogicalOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("%5b && %5b | %b %n",true,true,true && true);
		System.out.printf("%5b && %5b | %b %n",true,false,true && false);
		System.out.printf("%5b && %5b | %b %n",false,true,false && true);
		System.out.printf("%5b || %5b | %b %n",true,false,true || false);
		System.out.printf("%5b || %5b | %b %n",false,true,false || true);
		System.out.printf("%5b || %5b | %b %n",false,false,false || false);
		System.out.printf("!%5b | %5b  %n",true,!true);
		System.out.printf("!%5b | %5b %n",false,!false);
	}

}
