package Override;

public class overLOAD {
	public void say(String go,String so) {
		System.out.println("go: "+go);
		System.out.println("so: "+so);
	}
	public void say(String go) {
		System.out.println("go: "+go);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		overLOAD tan = new overLOAD();
		tan.say("morning","bye");
		tan.say("afternoon");
	}

}
