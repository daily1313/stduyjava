package ch06_12week;

class sp{
	void Print() {
		System.out.println("수 클래스");}}
class sc extends sp{
	void Print() {
		System.out.println("히 클래스");}
	void Print(String str) {
		System.out.println(str);}}
	
public class q7 {
	public static void main(String[] args) {
		sp ch=new sc();
		sc s = (sc)ch;
		s.Print();}}


