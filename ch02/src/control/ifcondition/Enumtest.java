package control.ifcondition;

public class Enumtest {
	public enum pl {c, cpp, java, csharp};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			pl clang = pl.c; // ������ ���������� �ϳ��� �ڷ��������� �̿�
			System.out.println(clang);
			
			clang = pl.csharp;
			switch(clang) {
			case csharp:
				System.out.println(clang + ": C# ���");
			}
			for(pl p: pl.values())
				System.out.print(p + " ");
			System.out.println();
	}

}
