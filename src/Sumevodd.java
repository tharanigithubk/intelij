import java.util.Scanner;
public class Sumevodd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number;
        char choice;
        int even=0;
        int odd=0;
        do {
            System.out.println("Enter any number:");
            number = sc.nextInt();
            if (number % 2 == 0) {
                even += number;
            } else {
                odd += number;
            }
            System.out.println("Do you want to continue:y/n?");
            choice = sc.next().charAt(0);
        }while (choice=='y'||choice=='y');
        System.out.println("sum of even number:"+even);
        System.out.println("sum of odd number:"+odd);
    }
}

