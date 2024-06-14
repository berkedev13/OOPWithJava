package NumberReverse;
import java.util.Scanner;
public class NumberReverse {
    public static int reverse(int digitNumber, int number) {
        int x = (int)Math.pow(10, digitNumber - 1);
        int y = 1;
        int reversedNumber = 0;
        for (int i = 0; i < digitNumber ; i++) {
            reversedNumber += ((number / x) * y);
            number %= x;
            x /= 10;
            y *= 10;
        }
        return reversedNumber;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many digits does the number have? ");
        int digitNumber = input.nextInt();
        System.out.print("Enter the number: ");
        int number = input.nextInt();
        int reversedNumber = reverse(digitNumber, number);
        System.out.println("Reversed Number: " + reversedNumber);

    }
}
