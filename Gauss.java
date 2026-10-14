import java.util.Scanner;
public class Gauss{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter x: " );
		double num = in.nextDouble();
		System.out.print("Enter n: " );
		double num2 = in.nextDouble();
		System.out.println(gauss(num,num2));
	}
	
	public static double gauss(double x, double n) {
		double current = 1;
		double output = 1;
		
		for (int i = 2; i <=n; i++) {
			current *=-1;
			current *=x*x;
			current /= i-1;
			output += current;
		
		}
		return output;
				
	}
}
