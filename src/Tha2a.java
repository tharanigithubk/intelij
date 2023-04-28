import java.util.Scanner;
public class Tha2a {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        System.out.println("enter the first number");
        int numone=sc.nextInt();
        System.out.println("enter the second number");
        int numtwo=sc.nextInt();
        int quotient=numone/numtwo;
        int reminder=numone%numtwo;
        System.out.println("after division the quotient and reminder are:");
        System.out.println("the quotient is :"+quotient);
        System.out.println("the reminder is :"+reminder);
    }
}
