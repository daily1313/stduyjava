package ch06_12week;

class sp{
	void Print() {
		System.out.println("�� Ŭ����");}}
class sc extends sp{
	void Print() {
		System.out.println("�� Ŭ����");}
	void Print(String str) {
		System.out.println(str);}}
	
public class q7 {
	public static void main(String[] args) {
		sp ch=new sc();
		sc s = (sc)ch;
		s.Print();}}


