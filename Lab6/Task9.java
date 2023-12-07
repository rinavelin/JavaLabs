package Lab6;

public class Task9 {
    public static void main(String[] args) {
        printMethod("The user with the nickname koala757677 this month wrote 3 times more comments than the user with the nickname croco181dile920 4 months ago");
    }

    static int combCounter(String str) {
        int count = 0;
        String[] parts = str.split(" ");
        for (int i = 0; i < parts.length; i++) {
            if (parts[i].matches(".*[a-zA-Z].*") && parts[i].matches(".*\\d.*")) {count++;}
        }
        return count;
    }

    static void printMethod(String str) {
        System.out.println(combCounter(str));
    }
}