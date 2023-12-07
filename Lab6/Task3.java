package Lab6;

public class Task3 {
    public static void main(String[] args) {
        printMethod(511);
    }

    static String intToOctalString(int i) {
        return Integer.toOctalString(i);
    }

    static void printMethod(int i) {
        System.out.println(intToOctalString(i));
    }
}