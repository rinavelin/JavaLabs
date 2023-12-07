package Lab3;

public class Task3 {
    public static void main(String[] args) {
        printResults(1, 2);
        printResults(10, 5);
        printResults(20, 4);
    }

    public double task(double k, double z) {
        if (k >= 15) {
            throw new IllegalArgumentException("param k = " + k);
        }
        double sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += (1 / Math.sqrt(z * i)) + Math.tan(k / i);
        }
        return sum;
    }

    static void printResults(double k, double z) {
        System.out.print("k:" + k + " z:" + z + " result:");
        try {
            Task3 result = new Task3();
            System.out.println(result.task(k, z));
        }
        catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    } 
}