package homework;

public class MadLife {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MadPlay madplay;
		madplay = new MadPlay();
		madplay.aMethod();
		System.out.println("default class 접근 가능, 동일 패키지 (Madlife)안에서");}}
class MadPlay {
public void aMethod() {
System.out.println("클래스 MadPlay 안에 있음 ");

	}

}
