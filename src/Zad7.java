import java.util.Scanner;

public class Zad7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj temperature w stopniach Celsjusza: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = celsius * 9 / 5 + 32;
        System.out.printf("%.1f stopni Celsjusza to %.1f stopni Fahrenheita\n", celsius, fahrenheit);
    }
}