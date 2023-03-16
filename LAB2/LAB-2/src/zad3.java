public class zad3 {
    public static void main(String args[]) {
        Podklasa pod = new Podklasa();
        Superklasa sup = pod;
        Superklasa sup2 = new Superklasa();
        pod.metodaObiektu();
        pod.metodaKlasy();
        sup.metodaObiektu();
        sup.metodaKlasy();
        sup2.metodaObiektu();
        sup2.metodaKlasy();
    }
}
