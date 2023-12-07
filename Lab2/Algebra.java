package Lab2;
import static java.lang.Math.*;


public class Algebra {
    public void math7(double a, double b, double c, double d) {
        System.out.println("The result of exercise 7 is: " + pow((4*cosh(sqrt(abs(a/b)))) + (3*acos(d)), c));
    }

    public void math8(double a, double b, double c, double d) {
        System.out.println("The result of exercise 8 is: " + (5*a/sin(a)) + sqrt(tanh(abs(b*c))/log(d)));
    }

    public void math9(double a, double b, double c, double d) {
        System.out.println("The result of exercise 9 is: " + (sin(abs(a)) + cos(sqrt(b))) / (2 * tan(c) + pow(E, d)));
    }
}