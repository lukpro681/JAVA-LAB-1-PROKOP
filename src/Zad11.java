import java.util.Scanner;

public class Zad11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj date w formacie dd.mm.rrrr: ");
        String dataString = scanner.nextLine();
        scanner.close();

        int dzien = Integer.parseInt(dataString.substring(0, 2));
        int miesiac = Integer.parseInt(dataString.substring(3, 5));
        int rok = Integer.parseInt(dataString.substring(6));

        int z = (miesiac <= 2) ? rok - 1 : rok;
        int c = (miesiac <= 2) ? 0 : 2;

        int dt = (23 * miesiac / 9 + dzien + 4 + rok + z / 4 - z / 100 + z / 400 - c) % 7;

        String[] dniTygodnia = {"Niedziela", "Poniedziałek", "Wtorek", "Środa", "Czwartek", "Piątek", "Sobota"};
        System.out.println("Podana data " + dataString + " to dzień tygodnia " + dniTygodnia[dt]);
    }
}
