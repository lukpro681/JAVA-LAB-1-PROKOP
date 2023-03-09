import java.util.Scanner;

public class Zad9 {
    public static void main(String[] args) {
        String s = "Jan Nowak 150 25,3"; // przykładowy łańcuch z danymi
        Scanner input = new Scanner(s);
        String firstName = input.next();
        String lastName = input.next();
        double godziny_przep = input.nextDouble();
        double stawka_godzinowa = input.nextDouble();

        double wynagrodzenie = godziny_przep * stawka_godzinowa;
        System.out.printf("Wynagrodzenie dla pracownika %s %s wynosi %.2f zł\n", firstName, lastName, wynagrodzenie);
        input.close();
    }
}