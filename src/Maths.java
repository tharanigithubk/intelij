import java.util.Scanner;

public class Maths {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first Number:");
        int num1=sc.nextInt();
        System.out.print("Enter second Number:");
        int num2=sc.nextInt();
        System.out.println("Addition two numbers:"+num1+"+"+num2+"="+(num1+num2));
        System.out.println("Subtraction two numbers:"+num1+"-"+num2+"="+(num1-num2));
        System.out.println("Multiplication two numbers;"+num1+"*"+num2+"="+(num1*num2));
        System.out.println("Division two numbers:"+num1+"/"+num2+"="+(num1/num2));
        System.out.println("Remainder two numbers:"+num1+"%"+num2+"="+(num1%num2));
    }
}
