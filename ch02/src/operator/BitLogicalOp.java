package operator;

public class BitLogicalOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=4,y=7;
		System.out.format("%x & %x -> %-8x %n",x,-1,x& -1);
		System.out.format("%x & %x -> %-8x %n",y,-1,y& -1);
		System.out.format("%x | %x -> %-8x %n",x,0,x | 0);
		System.out.format("%x | %x -> %-8x %n",y,0,y |0);
		System.out.format("(%x ^ 1)^1 -> %1$-4d %n",x,(x^1)^1);
		System.out.format("%1$-8x  %1$-4d %n",(~x)+1);
		System.out.format("%1$-8x  %1$-4d %n",(~y)+1);
	}

}
