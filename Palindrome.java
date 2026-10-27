import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a word or sentence: ");
        String str = in.nextLine();
        System.out.println(isPalindrome(str));
    }
    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        String nonLetters = ",.:;()[]{}!@#$%^&* ?-";
        String word = "";
        for (int i = 0; i < str.length(); i++) {
            String current = str.substring(i, i + 1);
            if (!nonLetters.contains(current)) {
                word += current;
            }
        }
        String firstHalf = "";
        String secondHalf = "";
        for (int i = 0; i < word.length() / 2; i++) {
            firstHalf += word.charAt(i);
            secondHalf += word.charAt(word.length() - 1 - i);
        }
        return firstHalf.equals(secondHalf);
    }
}
