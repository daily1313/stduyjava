package programming.basic;

class Sec{
public String instancevar="----����н�";
public void instanceMethod() {
System.out.println("----��ȭ�н�");}

public static void main(String[] args) {
System.out.println("�ΰ������� ����");

Sec fr=new Sec();  
System.out.println(fr.instancevar);
fr.instanceMethod();
}
public static void draw(String word) {
System.out.println(word);}}
