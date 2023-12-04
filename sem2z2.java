/*Напишите метод, который принимает на вход строку (String)
и определяет является ли строка палиндромом (возвращает boolean значение). */
public class sem2z1{
public static void main(String[] args) {
    System.out.println(palyndrom("HGFFGH"));
}
private static boolean palyndrom(String s) {
        StringBuilder sb = new StringBuilder(s);
        if (sb.reverse().toString().equals(s)) return true;
        else return false;
    }
}




/*

var2 {
    public static void main(String[] args) {
    System.out.println(palyndrom("HGFFGH"));;

}
    //    public static Boolean Palindromm(String str) {
//        StringBuilder stb = new StringBuilder(str);
//        System.out.println(stb.reverse());
//        String r = stb.reverse().toString();
//        if(str.equals(r)) return true;
//        else return false;
//
//    }
    private static boolean palyndrom(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString().equals(s);
//        StringBuilder sb = new StringBuilder(s);
//        if (sb.reverse().toString().equals(s)) return true;
//        else return false;
    }
}
*/