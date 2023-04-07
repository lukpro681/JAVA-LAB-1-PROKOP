import java.util.Random;

public class Menadzer extends Pracownik {
    private double bonus;

    public Menadzer(String imie, String nazwisko, double pensja, double bonus) {
        super(imie, nazwisko, pensja);
        this.bonus = bonus;
    }

    public Menadzer(String imie, String nazwisko, double pensja) {
        this(imie, nazwisko, pensja, 0);
    }

    public Menadzer(String imie, String nazwisko) {
        this(imie, nazwisko, 0, 0);
    }

    public Menadzer() {
        this("", "", 0, 0);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    static {
        Random rand = new Random();
        int nastepnyId = rand.nextInt(100);
        System.out.println("Wygenerowano nastepnyId: " + nastepnyId);
    }

    @Override
    public String getOpis() {
        return "Menadzer: " + getImie() + " " + getNazwisko() + ", pensja: " + (getPensja() + bonus);
    }

    @Override
    public String toString() {
        return getClass().getName() + ": " + getOpis();
    }
}
