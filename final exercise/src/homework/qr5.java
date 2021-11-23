package homework;

class qs5 {
	String Print() {
		return "A";}}
class qs6 extends qs5{
	String Print() {
		return "B";}}

public class qr5{
	public static void main(String[] args) {
	    qs5 m = new qs6();
		m.Print();
}
}

