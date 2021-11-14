package operator;

public class BitComp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 3;
		int y = 0xffff_ffff;
		System.out.printf("%d의 이진수: %s %n",y,Integer.toBinaryString(y));
		System.out.println(x&=y);
		System.out.println(x);
		
		int key = 120;
		System.out.println(x ^= key);
		System.out.println(x ^= key);
		
	}

}
