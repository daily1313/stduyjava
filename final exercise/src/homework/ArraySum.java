package homework;

public class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		
			for (String value: args) {
			System.out.print(value + " ");
			sum += Integer.parseInt(value) ;
		}
		System.out.println();
		System.out.printf("Че: %d ЦђБе: %f %n", sum, (double) sum/args.length);

	}

}
