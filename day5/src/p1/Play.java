package p1;

public class Play {
	protected String print() {
		String sen="다른 package에서 protected 멤버는 상속된 클래스에서 가능하다";
		return sen;
	}
	protected String getOne() {
		String one = "one";
		return one;
	}
}
