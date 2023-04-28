import java.util.Scanner;
public class Rhombus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the diagonal 1:");
        double a=sc.nextDouble();
        System.out.println("Enter the diagonal 2:");
        double b=sc.nextDouble();
        double area=(a*b)/2;
        System.out.println("Area of rhombus:"+area);
    }
}
