package ch06_12week;

class qs5 {
	String Print() {
		return "A";}}
class qs6 extends qs5{
	String Print() {
		return "B";}}

public class qr5{
	public static void main(String[] args) {
	   qs5 s = new qs6();
	   System.out.println(s.Print());;}}

