import java.util.Scanner;
public class Arotria {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the width of triangle:");
        double w=sc.nextDouble();
        System.out.println("Enter the height of triangle:");
        double h=sc.nextDouble();
        double area=(w*h)/2;
        System.out.println("Area of the triangle:"+area);
    }
}
