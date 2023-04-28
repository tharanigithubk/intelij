import java.util.Scanner;
public class Positive {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter any number:");
        if (num.hasNextLong()) {
            long in = num.nextLong();
            if (in < 0) {
                in *= -1;
            }
            {
                int digits = 1;
                if (in >= 10 && in < 100) {
                    digits = 2;
                } else if (in >= 100 && in < 1000) {
                    digits = 3;
                } else if (in >= 1000 && in < 10000) {
                    digits = 4;
                } else if (in >= 10000 && in < 100000) {
                    digits = 5;
                } else if (in >= 100000 && in < 1000000) {
                    digits = 6;
                } else if (in >= 1000000 && in < 10000000) {
                    digits = 7;
                } else if (in >= 10000000 && in < 100000000) {
                    digits = 8;
                } else if (in >= 100000000 && in < 1000000000) {
                    digits = 9;
                } else if (in >= 1000000000 && in < 10000000000L) {
                    digits = 10;
                }
                System.out.println("Number of digits in the number:" + digits);
            }
        } else {
            System.out.println("The number not on integer:");
        }
    }
}