package Lab3;

public class Task8 {
    public static void main(String[] args) {
        printResults(5, 4);
        printResults(10, 9);
        printResults(8, 0);
    }

    public double task(int n, double t) {
        if (t <= 0) {
            throw new IllegalArgumentException("param t = " + t);
        }
        double sum1 = 0;
        double sum2 = 0;
        for (int l = 1; l <= 5; l += 2) {
            for (int i = 1; i <= n; i++) {
                sum1 += l / t;
            }
        }
        for (int l = 2; l <= 6; l += 2) {
            for (int i = 1; i <= n; i++) {
                sum2 += l / Math.sqrt(t);
            }
        }
        return sum1 + sum2;
    }

    static void printResults(int n, double t) {
        System.out.print("n:" + n + " t:" + t + " result:");
        try {
            Task8 result = new Task8();
            System.out.println(result.task(n, t));
        }
        catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    } 
}