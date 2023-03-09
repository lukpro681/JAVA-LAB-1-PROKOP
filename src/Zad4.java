public class Zad4 {
    public static void main(String args[]){
        System.out.println("Wybrane stałe i metody statyczne klasy Integer\n");
        System.out.println("Integer.MIN_VALUE "+Integer.MIN_VALUE);
        System.out.println("Integer.MAX_VALUE "+Integer.MAX_VALUE);
        System.out.println("Integer.SIZE "+Integer.SIZE);
        int a=179;
        System.out.println("a= "+a);
        System.out.println("Integer.toBinaryString(a) "+Integer.toBinaryString(a));
        System.out.println("Integer.toOctalString(a) "+Integer.toOctalString(a));
        System.out.println("Integer.toHexString(a) "+Integer.toHexString(a));
        System.out.println("Integer.toString(a) "+Integer.toString(a));// w systemie 10
        System.out.println("Integer.toString(a,4) "+Integer.toString(a,4));// w systemie 4
        int b=Integer.parseInt("-177");
        System.out.println("b= "+b);
        int c=Integer.parseInt("1000",8);//układ pozycyjny o podstawie 8
        System.out.println("c= "+c);
        System.out.println("Integer.signum(a) "+Integer.signum(a));//znak liczby
        System.out.println("Integer.signum(b) "+Integer.signum(b));
        System.out.println("Integer.signum(0) "+Integer.signum(0)); }}

