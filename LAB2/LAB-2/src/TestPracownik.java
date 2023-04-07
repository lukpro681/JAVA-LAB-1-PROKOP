public class TestPracownik {
    public static void main(String[] args) {
        Menadzer m1 = new Menadzer("Jan", "Kowal", 10000);
        m1.setBonus(15000);

        Pracownik[] pracownicy = new Pracownik[6];
        pracownicy[0] = new Pracownik();
        pracownicy[1] = new Pracownik("Adam", "Nowacki", 2000);
        pracownicy[2] = new Menadzer("Piotr", "Żyła", 5000);
        pracownicy[3] = new Pracownik("Katarzyna", "Nowak", 2500);
        pracownicy[4] = new Menadzer("Tomasz", "Terka", 7000);
        pracownicy[5] = new Pracownik("Ewa", "Niewiem");



        for (Pracownik pracownik : pracownicy) {
            System.out.println("Id: " + pracownik.getId());
            System.out.println("Nazwisko: " + pracownik.getNazwisko());
            System.out.println("Pensja: " + pracownik.getPensja());

            System.out.println("Nowa pensja: " + pracownik.getPensja());
            System.out.println();
        }
    }
}
