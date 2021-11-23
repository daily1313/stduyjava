package homework;

class Processor{
	  public Processor(){
	    System.out.println("Inside Processor() ");}}
class I3Processor extends Processor{
		public I3Processor(){
	    System.out.println("Inside I3Processor() ");}}
class I5Processor extends I3Processor{
		 public I5Processor(){
	    System.out.println("Inside I5Processor() ");}}
	public class JavaIn2{
	  public static void main(String[] args){
	    I5Processor i5 = new I5Processor();}}

