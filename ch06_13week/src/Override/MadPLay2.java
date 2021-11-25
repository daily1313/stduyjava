package Override;
class Uint1{
	public void sayName() {
		System.out.println("art!");
	}
}
class Zerg2 extends Uint1{
	public void sayName() {
		System.out.println("write!");
	}
}
public class MadPLay2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Uint1 u = new Zerg2();
		u.sayName();
	}

}
