import java.util.Objects;

public class FractionLP {
    private int num;
    private int den;

    public FractionLP(int num, int den) {
        if (den == 0) {
            throw new IllegalArgumentException("Parametr n=0!");
        }
        this.num = num;
        this.den = den;
        correction();
        reduce();
    }
    private void correction() {
        if (den < 0) {
            num = -num;
            den = -den;
        }
    }
    public FractionLP() {
        this(0, 1);
    }

    public FractionLP(int m) {
        this(m, 1);
    }

    public FractionLP(FractionLP other) {
        this.num = other.num;
        this.den = other.den;
    }

    public int getNum() {
        return num;
    }

    public int getDen() {
        return den;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setDen(int den) {
        if (den <= 0) {
            throw new IllegalArgumentException("Mianownik musi być większy od zera!");
        }
        this.den = den;
    }

    public void setFrac(int num, int den) {
        if (den <= 0) {
            throw new IllegalArgumentException("Mianownik musi być większy od zera!");
        }
        this.num = num;
        this.den = den;
    }
    public FractionLP add(FractionLP other) {
        int newNum = this.num * other.den + other.num * this.den;
        int newden = this.den * other.den;
        return new FractionLP(newNum, newden);
    }

    public FractionLP subtract(FractionLP other) {
        int newNum = this.num * other.den - other.num * this.den;
        int newDenominator = this.den * other.den;
        return new FractionLP(newNum, newDenominator);
    }

    public FractionLP multiply(FractionLP other) {
        int newNum = this.num * other.num;
        int newDenominator = this.den * other.den;
        return new FractionLP(newNum, newDenominator);
    }

    public FractionLP divide(FractionLP other) {
        int newnum = this.num * other.den;
        int newden = this.den * other.num;
        return new FractionLP(newnum, newden);
    }

    public FractionLP reciprocal() {
        return new FractionLP(den, num);
    }

    public String toString() {
        return num + "/" + den;
    }

    private int nwd(int a, int b) {
        if (a == 0 || b == 0) {
            return a + b;
        } else {
            return nwd(b, a % b);
        }
    }

    public void reduce() {
        int nwd = nwd(Math.abs(num), den);
        num /= nwd;
        den /= nwd;
    }

    public void reduce(int d) {
        if (d > 0) {
            num /= d;
            den /= d;
        }
    }

    public FractionLP equivalent(int d) {
        num *= d;
        den *= d;
        reduce();
        return this;
    }
    public FractionLP mult(int number) {
        FractionLP result = new FractionLP(num * number, den);
        result.reduce();
        return result;
    }

    public FractionLP mult(FractionLP other) {
        FractionLP result = new FractionLP(num* other.num, den * other.den);
        result.reduce();
        return result;
    }

    public static FractionLP product(FractionLP f1, FractionLP f2) {
        return f1.multiply(f2);
    }

    public static FractionLP product(FractionLP f, int i) {
        return f.equivalent(i);
    }

    public static FractionLP product(int i, FractionLP f) {
        return f.equivalent(i);
    }

    public static FractionLP product(FractionLP f1, FractionLP f2, FractionLP f3) {
        return f1.multiply(f2).multiply(f3);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FractionLP that = (FractionLP) o;
        return num == that.num && den == that.den;
    }

    @Override
    public int hashCode() {
        return Objects.hash(num, den);
    }

    public static void main(String[] args) {
        FractionLP a = new FractionLP(75, 100);
        FractionLP b = new FractionLP(15, 20);
        FractionLP c = new FractionLP(-3, -4);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        a.equivalent(5);
        System.out.println(a);

        a.reduce();
        System.out.println(a);

        b.reduce(5);
        System.out.println(b);

        FractionLP d = new FractionLP(3, 4);
        FractionLP e = new FractionLP(-2, 5);

        FractionLP f = d.mult(e); // iloczyn a i b
        System.out.println(f); // wynik: -3/10

        FractionLP g = d.mult(2); // iloczyn a i liczby 2
        System.out.println(g); // wynik: 3/2

        FractionLP f1 = new FractionLP(2, 3);
        FractionLP f2 = new FractionLP(3, 4);
        FractionLP f3 = new FractionLP(-4, 5);
        FractionLP f4 = new FractionLP(1, -2);


        FractionLP wynik1 = FractionLP.product(f1, f2);
        System.out.println(f1 + " * " + f2 + " = " + wynik1);


        FractionLP wynik2 = FractionLP.product(f2, 2);
        System.out.println(f2 + " * " + "2" + " = " + wynik2);
    }
}
