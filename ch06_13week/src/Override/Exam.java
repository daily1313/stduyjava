package Override;

public class Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Switch tv = new ntv();
		tv.init();
		tv.end();
		Switch tv2 = new ntv();
		tv2.init();
		((ntv)tv2).mid();
		tv2.end();
	}

}
