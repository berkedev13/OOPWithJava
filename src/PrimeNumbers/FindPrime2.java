package PrimeNumbers;
import java.util.Scanner;
public class FindPrime2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number: ");
        int number = input.nextInt();
        boolean check = false;
        for (int j = 2; j <= number; j++) {
            for(int i = 2; i < j; i++) {
                if(j % i == 0) {
                    check = true;
                    break;
                }
            }
            if (!check) {
                System.out.println(j);
            }
            check = false;
        }

    }
}
