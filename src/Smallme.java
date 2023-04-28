import java.util.Scanner;

public class Smallme {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the first value:");
        double a = in.nextDouble();
        System.out.println("enter the second value:");
        double b = in.nextDouble();
        System.out.println("enter the third value:");
        double c = in.nextDouble();
        System.out.print("the smallest value is " + smallest(a, b, c) + "\n");
    }
    public static double smallest(double a,double b,double c)
    {
        return (a+b+c)/3;
    }
}
