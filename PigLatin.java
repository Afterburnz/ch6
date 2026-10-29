import java.util.Scanner;
public class PigLatin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a word or sentence: ");
        String str = in.nextLine();
        System.out.println(pigLatin(str));
    }
    public static String translateWord(String word) {
        if (word.length() > 2) {
            return word.substring(1) + word.substring(0, 1) + "ay";
        }
        return word;
    }
    public static String pigLatin(String msg) {
        String word = "";
        String result = "";
        msg += " ";
        for (int i = 0; i < msg.length(); i++) {
            if (msg.charAt(i) != ' ') {
                word += msg.substring(i, i + 1);
            }
            else if (!word.equals("")) {
                if (!result.equals("")) {
                    result += " ";
                }
                result += translateWord(word);
                word = "";
            }
        }
        return result;
    }
}
