import java.util.Scanner;
public class PigLatin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a word or sentence: ");
        String str = in.nextLine();
        System.out.println(pigLatin(str));
    }
    public static String pigLatin(String msg) {
		String word = "";
		for (int o = 0; o<msg.length(); o++) {
			if (msg.indexOf(" ", o) > 2){
				for (int i = 1; i<msg.length();i++){
					word+=msg.substring(i,i+1);
				}
				word+=msg.substring(0,1);
				word+="ay ";
			}
			return word;
		}
    }
}
