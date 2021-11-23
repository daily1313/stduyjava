package homework;


class Sweet{
			public  void price(){
			    System.out.print("Sweet=$10 ");}}
			class Sugar extends Sweet{
			  public void price(){
			    super.price();
			    System.out.print("Sugar=$20 ");
			    super.price();}}
public class JavaIn{
			  public static void main(String[] args){
				  Sugar su = new Sugar();
			      su.price();}}

