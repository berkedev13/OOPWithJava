package PrimeNumbers;
import java.util.Scanner;
public class FindPrime1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number: ");
        int number = input.nextInt();
        boolean check = false;
        for(int i = 2; i < number; i++) {
            if(number % i == 0) {
                check = true;
                break;
            }
        }
        if (check) {
            System.out.println("It is not prime.");
        } else {
            System.out.println("It is prime.");
        }

    }
}
