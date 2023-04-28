import java.util.Scanner;
public class Palindrom {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int num;
        System.out.println("enter the number:");
        num = console.nextInt();
        if (ispalindrom(num)) {
            System.out.println("number is palindrom:");
        } else {
            System.out.println("number is not palindrom:");
        }
    }

    public static boolean ispalindrom(int number) {
        int temp = number;
        int remainder;
        int reverse = 0;

        while (temp > 0)
        {
            remainder = temp % 10;
            temp = temp / 10;
            reverse = reverse * 10 + remainder;
        }
        return reverse == number;
    }
}



