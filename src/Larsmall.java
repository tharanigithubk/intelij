import java.util.Scanner;
public class Larsmall {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        char choice;
        do {
            System.out.println("Enter the number:");
            number = sc.nextInt();
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
            System.out.println("Do you want to continue y/n?:");
            choice = sc.next().charAt(0);
        }while (choice=='y'||choice=='y');
        System.out.println("largest number:"+max);
        System.out.println("smallest number:"+min);
        }
    }
