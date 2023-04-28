import java.util.Scanner;
public class Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number,
                countPositive = 0,
                countNegative = 0,
                countZero = 0;
        char choice;
        do {
            System.out.println("Enter the number:");
                number = sc.nextInt();
                if (number > 0) {
                    countPositive++;
                } else if (number < 0) {
                    countNegative++;
                } else {
                    countZero++;
                }
                System.out.print("Do you want to continue:y/n?");
                choice= sc.next().charAt(0);
            }
            while (choice== 'y' || choice == 'y') ;
            System.out.println("Positive number:" + countPositive);
            System.out.println("Negative number:" + countNegative);
            System.out.println("Zero:" + countZero);
        }
    }


