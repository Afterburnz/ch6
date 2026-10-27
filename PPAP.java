import java.util.Scanner;

public class PPAP {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String str = in.nextLine();
        System.out.println(ppap(str));
    }

    public static String ppap(String str) {
        int first = str.indexOf("I have a ") + 9;
        int second = str.indexOf("I have a ", first) + 9;
        String word1 = str.substring(first, second - 11);
        String word2 = str.substring(second);
        word2 = word2.substring(0, 1).toUpperCase() + word2.substring(1);
        return "Uh! " + word2 + " " + word1;
    }
}
