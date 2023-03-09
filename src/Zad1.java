public class Zad1 {
    public static void main(String[] args) {
        System.out.println("Kody liczbowe:");
        for (int i = 48; i <= 124; i++) {
            char c = (char) i;
            System.out.printf("%d: %c\n", i, c);
        }
    }
}
