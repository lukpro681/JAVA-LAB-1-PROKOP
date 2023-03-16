public class Wyklad
{
    public class A {
        public void f() {
            System.out.println("Klasa A"); } }

    public class B extends A {
        /* ta metoda przesłania metodę f z klasy A,
        ale wywołuje również przesłoniętą metodę
        f z klasy A*/
        public void f() {
            super.f();
            System.out.println("Klasa B"); }
        //ta metoda wywołuje metodę f z klasy B
        public void g() {
            f(); }
        //ta metoda wywołuje metodę f z klasy A
        public void h() {
            super.f(); } }


    public class Main {
        public void main(String args[]) {
            A a=new A();
            B b=new B();
            System.out.println("Wynik a.f():");
            a.f();
            System.out.println("\nWynik b.f():");
            b.f();
            System.out.println("\nWynik b.g():");
            b.g();
            System.out.println("\nWynik b.h():");
            b.h(); } }

    public final class Obliczenia {
        public final int liczba1=100;
        public int liczba2;
        public void licz() {
            liczba2=2*liczba1;
            liczba2=liczba2+liczba1;
//liczba1=liczba2/2;
            System.out.println(liczba1);
            System.out.println(liczba2);
        }
        public void main(String args[]) {
            Obliczenia obliczenia=new Obliczenia();
            obliczenia.licz();
        }
    }




}

class Superklasa{
    public static void metodaKlasy(){
        System.out.println("Metoda statyczna superklasy"); }
    public void metodaObiektu(){
        System.out.println("Metoda niestatyczna superklasy"); } }
class Podklasa extends Superklasa{
    public static void metodaKlasy(){
        System.out.println("Metoda statyczna podklasy"); }
    public void metodaObiektu(){
        System.out.println("Metoda niestatyczna podklasy"); } }