package programming.basic;

class Sec{
public String instancevar="----기계학습";
public void instanceMethod() {
System.out.println("----심화학습");}

public static void main(String[] args) {
System.out.println("인공지능의 구조");

Sec fr=new Sec();  
System.out.println(fr.instancevar);
fr.instanceMethod();
}
public static void draw(String word) {
System.out.println(word);}}
