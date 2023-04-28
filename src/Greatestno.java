import java.util.Scanner;

public class Greatestno {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("ENTER 1'st number:");
        int num1=scan.nextInt();
        System.out.println("Enter 2'nd number:");
        int num2=scan.nextInt();
        System.out.println("Enter 3'rd number:");
        int num3=scan.nextInt();
        if (num1>num2)
            if (num1>num3)
                System.out.println("Number is greatest is:"+num1);
        if (num2>num1)
            if (num2>num3)
                System.out.println("Number is greatest is:"+num2);
        if (num3>num2)
            if (num3>num1)
                System.out.println("Number is greatest is:"+num3);
    }
}
