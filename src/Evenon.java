import java.util.Scanner;
public class Evenon {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int num;
        System.out.println("enter an integer:");
        num = console.nextInt();
        if (isEven(num)) {
            System.out.println("number is even:");
        } else {
            System.out.println("number is odd:");
        }
    }

    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}

