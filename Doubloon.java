import java.util.Scanner;

public class Doubloon {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a word: ");
		String word = in.nextLine();
		System.out.println(isDoubloon(word));
	
	}

	public static boolean isDoubloon(String s) {
		s = s.toLowerCase();

		for (int i = 0; i < s.length(); i++) {
			int count = 0;

			for (int o = 0; o < s.length(); o++) {
				if (s.charAt(i) == s.charAt(o)) {
					count++;
				}
			}

			if (count != 2) {
				return false;
			}
		}

		return true;
	}


}
