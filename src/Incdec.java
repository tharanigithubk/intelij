import java.util.Scanner;
public class Incdec {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input first number:");
        double num1 = in.nextDouble();
        System.out.println("Input second number:");
        double num2 = in.nextDouble();
        System.out.println("Input third number:");
        double num3 = in.nextDouble();
        if (num1 < num2 && num2 < num3) {
            System.out.println("Number are in increasing order:");
        } else if (num1 > num2 && num2 < num3) {
            System.out.println("Number are in decreasing order:");
        } else {
            System.out.println("Neither increasing or decreasing order:");
        }
    }
}
            
