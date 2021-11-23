package homework;

class Food{
	  void show(){
	    System.out.print("FOOD ");}}
class Bread extends Food{
	  void toast(){
	    System.out.print("TOASTED ");}}
public class Inhe5{
	  public static void main(String[] args){
	    Bread br = new Bread();
	    br.toast();
	    br.show();
	}}

