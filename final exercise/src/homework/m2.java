package homework;

class m1 {
	public String name="차량";
	public double maxSpeed;
	public int seater;
	public m1() {}
	public m1(double maxSpeed, int seater) {
		this.maxSpeed = maxSpeed;
		this.seater =seater;}}
public class m2 extends m1{
	public String name ="자동차";
	public int displacement;
	public m2() {
		super();}
public m2(double maxSpeed, int seater, int displacement) {
		super(maxSpeed, seater);
		this.displacement = displacement;}
public static void main(String[] args) {
		m2 m22 = new m2(200,0,5000);
System.out.println("maxSpeed= "+m22.maxSpeed+", displacement= "+m22.displacement);}}
