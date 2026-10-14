import java.util.Scanner;
public class Roots{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number: " );
		double num = in.nextDouble();
		System.out.println(sqrt(num));
	}
	
	public static double sqrt (double n) {
		double n0 = n/2;
		double n1 = n/2;
				
		while (Math.abs(n0*n0-n) > 0.0001 && Math.abs(n1*n1-n) > 0.0001) {
			n0=n1;
			n1=(n0+n/n0)/2;
		}
		return n0;
	}
}
