import java.util.Scanner;

public class Zad8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj długość pierwszej przyprostokątnej: ");
        double cathetus1 = scanner.nextDouble();
        System.out.print("Podaj długość drugiej przyprostokątnej: ");
        double cathetus2 = scanner.nextDouble();
        double hypotenuse = Math.sqrt(cathetus1 * cathetus1 + cathetus2 * cathetus2);
        System.out.printf("Długość przyprostokątnej wynosi %.3f\n", hypotenuse);
    }
}