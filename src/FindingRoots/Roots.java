package FindingRoots;
import java.util.Scanner;
public class Roots {

    public static void findingRoots(int a, int b, int c){
        double delta = Math.pow(b, 2) - (4.0 * a * c);
        if (delta < 0) {
            System.out.println("Reel kök bulunamadı.");
            return;
        }
        double x1, x2;
        x1 = (-b + Math.sqrt(delta)) / (2*a);
        x2 = (-b - Math.sqrt(delta)) / (2*a);
        System.out.println("Girdiğiniz denklem: " + a + "x^2 + " + b + "x +" + c);
        System.out.println("İlk kök: " + x1);
        System.out.println("İkinci kök: " + x2);

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ax^2+bx+c:");
        System.out.println("Formatında denklemin köklerini giriniz.");
        System.out.print("a: ");
        int a = input.nextInt();
        System.out.print("b: ");
        int b = input.nextInt();
        System.out.print("c: ");
        int c = input.nextInt();
        findingRoots(a, b , c);
    }


}
