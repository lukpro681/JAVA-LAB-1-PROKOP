public class Student extends Osoba {
    private String kierunek;

    public Student(String imie, String nazwisko, String kierunek) {
        super(imie, nazwisko);
        this.kierunek = kierunek;
    }

    public Student(String imie, String nazwisko) {
        this(imie, nazwisko, "");
    }

    @Override
    public String getOpis() {
        return "Student: " + getImie() + " " + getNazwisko() + " " + this.kierunek;
    }

    public Student() {
        this("", "", "");
    }
}
