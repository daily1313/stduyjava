package operator;

public class BitMask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int plus = 1, minus = -1;
		System.out.printf("%d�� ������: %s %n",plus,Integer.toBinaryString(plus));
		System.out.printf("%d�� ������: %s %n",minus,Integer.toBinaryString(minus));
		System.out.printf("%d�� ������: %s %n",~plus,Integer.toBinaryString(minus));
		
		int x = 287956;
		System.out.printf("%d�� ������: %s %n",x,Integer.toBinaryString(x));
		int num = 4;
		int mask = 1<<num-1;
		System.out.printf("%d�� �����ʿ��� %d��° ��Ʈ ��: ",x,num);
		System.out.printf("%d %n",((x & mask)==0) ? 0:1);
	}

}
