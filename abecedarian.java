import java.util.Scanner;

public class abecedarian {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a word: ");
		String s = in.nextLine();
		System.out.println(isAbecedarian(s));
	
	}

	public static boolean isAbecedarian (String str) {
		str = str.toLowerCase();
		for (int i = 0; i < str.length()-1; i++) {
			if (str.charAt(i) > str.charAt(i+1)) {
				return false;
			}
			
		}
		return true;
	}


}
