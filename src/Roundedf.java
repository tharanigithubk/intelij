import java.util.*;
public class Roundedf {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input any double number: ");
        double x = in.nextDouble();
        System.out.printf("The rounded value of %f is: %.2f",x, round_num(x));
        System.out.printf("\n");
    }
    public static double round_num(double fn) {
        double f_num =(double)Math.floor(fn);
        double c_num =(double)Math.ceil(fn);
        if ((fn - f_num) > (c_num - fn)) {
            return c_num;
        } else if ((c_num - fn) > (fn - f_num)) {
            return f_num;
        } else {
            return c_num;
        }
    }
}