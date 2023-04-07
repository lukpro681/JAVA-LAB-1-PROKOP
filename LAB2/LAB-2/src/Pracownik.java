public class Pracownik extends Osoba {
    private double pensja;
    private int id;
    private static int nastepneId = 1;

    public Pracownik(String imie, String nazwisko, double pensja) {
        super(imie, nazwisko);
        this.id = przyznajId();
        this.pensja = pensja;
    }
    public int getId() {
        return id;
    }

    private static int przyznajId() {
        return nastepneId++;
    }
    public Pracownik(String imie, String nazwisko) {
        this(imie, nazwisko, 0);
    }

    public Pracownik() {
        this("", "", 0);
    }

    public double getPensja() {
        return pensja;
    }

    public void setPensja(double pensja) {
        this.pensja = pensja;
    }

    @Override
    public String getOpis() {
        return "Pracownik: "+ getId() + " " + getImie() + " " + getNazwisko() + ", pensja: " + pensja;
    }

    @Override
    public String toString() {
        return getClass().getName() + ": " + getOpis();
    }
}

