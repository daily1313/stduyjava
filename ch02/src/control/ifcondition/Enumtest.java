package control.ifcondition;

public class Enumtest {
	public enum pl {c, cpp, java, csharp};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			pl clang = pl.c; // 정의한 열거유형은 하나의 자료유형으로 이용
			System.out.println(clang);
			
			clang = pl.csharp;
			switch(clang) {
			case csharp:
				System.out.println(clang + ": C# 언어");
			}
			for(pl p: pl.values())
				System.out.print(p + " ");
			System.out.println();
	}

}
