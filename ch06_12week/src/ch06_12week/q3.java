package ch06_12week;

class A4{
	   final int fi = 10;
	}
	public class q3 extends A4{
	   int fi = 15;
	   public static void main(String[] args){
	       q3 b = new q3();
	       b.fi = 20;
	       System.out.println(b.fi);
	       System.out.println(A4.fi); // final int 에서는 하위클래스에서 메소드 오버라이딩이 허용되지 않도록 하기에 10으로 출력해야한다. 
	   }
	}

