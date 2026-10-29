import java.util.Scanner;
public class Binary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = in.nextInt();
        System.out.println(convertToBinary(num));
    }

    public static String convertToBinary(int num) {
        String binary = "";
        if (num == 0) {
            return "0";
        }
        while (num > 0) {
            int remainder = num % 2;
            binary = remainder + binary;
            num = num / 2;
        }
        return binary;
    }
}
