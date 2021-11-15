package day1;

public class Enum {
	public enum pl{c,cpp,java,csharp};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pl clang = pl.c;
		System.out.println(clang);
		
		clang = pl.csharp;
		switch(clang) {
		case csharp:
			System.out.println(clang + " : C# ¾ð¾î");
		}
		for(pl p : pl.values()) {
			System.out.print(p+" ");
		}
		System.out.println();
	}

}
