import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p = 1;
        System.out.println("Enter the variable 'a'.");
        double num1 = in.nextDouble();
        System.out.println("variable a=" + num1);
        System.out.println("please!choose an operation on perform.e.g.:+,-,*,/,^.");
        char c = in.next().charAt(0);
        System.out.println("Operator=" + c);
        System.out.println("please!Enter the variable 'b'.");
        double num2 = in.nextDouble();
        System.out.println("variable b=" + num2);
        System.out.print("Result:" + num1 + c + num2 + "=");
        if (c == '+') {
            System.out.print(num1 + num2);
        } else if (c == '-') {
            System.out.print(num1 - num2);
        } else if (c == '*') {
            System.out.print(num1 * num2);
        } else if (c == '/') {
            System.out.print(num1 / num2);
        } else if (c == '^') {
            for (int i = 1; i < num2; i++) {
                p *= num1;
            }
            System.out.print(p);
        } else {
            System.out.println("please!enter a valid operator.");
        }
    }
}
