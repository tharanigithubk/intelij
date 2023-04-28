import java.util.Scanner;
public class Hcf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int divided, divisor;
        int remainder, hcf = 0;
        System.out.println("Enter the first number:");
        divided = sc.nextInt();
        System.out.println("Enter the second number:");
        divisor = sc.nextInt();
        do {
            remainder = divided %divisor;
            if (remainder == 0) {
                hcf = divisor;
            } else {
                divided = divisor;
                divisor = remainder;
            }
        } while (remainder != 0);
        System.out.println("HCF:" + hcf);
    }
}

