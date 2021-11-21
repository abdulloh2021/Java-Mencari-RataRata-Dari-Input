import java.util.Scanner;

public class Java_Mencari_RataRata_Dari_Input {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.println("================ Input =====================");
		System.out.println("Enter your number. when finished type 'X'");
		double total = 0;
		double  max = 0;
		int count =0;
		double average = 0;
		while (sn.hasNextDouble()) {
			double angkaMasukan = sn.nextDouble();
			total = total + angkaMasukan;
			count = count +1;
			average = total/count;
		}
		System.out.println("================ Output =====================");
		System.out.println("Total Value Input Number = " + total);
		System.out.println("Total Count Input Number = " + count);
		System.out.println("(Formula)");
		System.out.println("Average = Total Value / Total Count");
		System.out.println("Average = "+ total +" / "+ count);
		System.out.println("Average = "+average);
	}
}
