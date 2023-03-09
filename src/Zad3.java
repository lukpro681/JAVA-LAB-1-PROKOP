public class Zad3 {
    public static void main(String args[]){
        String napis="Zadania z programowania.";
        System.out.println(napis);
        System.out.println(napis.charAt(0));
        System.out.println(napis.length());
        System.out.println(napis.charAt(napis.length()-1));
        System.out.println(napis.toUpperCase());
        System.out.println(napis.toLowerCase());
        System.out.println(napis.indexOf('z'));
        System.out.println(napis.indexOf("prog"));
        char kropka='.', pytajnik='?';
        System.out.println(napis.replace(kropka,pytajnik));
        System.out.println(napis.replace("adania","dania"));
        String str1="ania", str2="anka";
        System.out.println(napis.replaceAll(str1,str2));
        System.out.println(napis.replaceFirst(str1,str2));
        System.out.println(napis.substring(10));
        System.out.println(napis.substring(10,17));
        str1="\b z podpowiedziami.";
        System.out.println(napis.concat(str1));
        System.out.println(napis+str1.substring(0,4)+str1.substring(5)); } }

