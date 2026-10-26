import java.util.Scanner;
public class Scrabble {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your letters: ");
        String letters = in.nextLine();
        System.out.print("Enter a word: ");
        String word = in.nextLine();
        System.out.println(canSpell(letters, word));
    }

    public static boolean canSpell(String letters, String word) {
        letters = letters.toLowerCase();
        word = word.toLowerCase();
        for (int i = 0; i < word.length(); i++) {
            boolean found = false;
            for (int j = 0; j < letters.length() && !found; j++) {
                if (word.charAt(i) == letters.charAt(j)) {
                    found = true;
                    letters = letters.substring(0, j) + letters.substring(j + 1);
                }
            }
            if (!found) {
                return false;
            }
        }
        return true;
    }
}
