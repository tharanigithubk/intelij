import java.util.Scanner;
public class Testno {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.print("Input number:");
        if (num>0)
        {
            System.out.println("Number is positive:");
        }
        else if (num<0)
        {
            System.out.println("Number is Negative:");
        }
        else
        {
            System.out.println("Number is zero:");
        }

    }
}
