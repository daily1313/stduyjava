package inheritance.overloading;

public class Sum {
	public int add(int a,int b) {
		return a+b;
	}
	public int add(int a,int b,int c) {
		return a+b+c;
	}
	public int add(int a[],int n) {
		int sum=0;
		for(int i=0;i<n;i++) {
			sum += a[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sum adder = new Sum();
		System.out.println(adder.add(3, 6));
		System.out.println(adder.add(3, 6,9));
		System.out.println(adder.add(new int[] {3,6,9,12},4));
	}

}
