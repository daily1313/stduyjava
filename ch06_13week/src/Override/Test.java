package Override;
interface AAA{
	void aaa();
}
interface BBB{
	void bbb();
}
class CCC implements AAA, BBB{
	public void aaa() {
		System.out.println("AAA");
	}
	public void bbb() {
		System.out.println("BBB");
	}
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AAA ccc = new CCC();
		BBB ddd = new CCC();
		ccc.aaa();
		ddd.bbb();
	}

}
