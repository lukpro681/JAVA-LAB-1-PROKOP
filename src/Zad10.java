import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Zad10 {
    public static void main(String[] args) throws IOException {
        File plik = new File("file.txt");
        Scanner input = new Scanner(plik);
        while (input.hasNext()) {
            String firstName = input.next();
            String lastName = input.next();
            double godziny_przep = input.nextDouble();
            double stawka_godzinowa = input.nextDouble();

            double wynagrodzenie = godziny_przep * stawka_godzinowa;
            System.out.printf("Wynagrodzenie dla pracownika %s %s wynosi %.2f zł\n", firstName, lastName, wynagrodzenie);
        }
            input.close();



    }
}