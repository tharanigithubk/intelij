import java.util.Scanner;
public class Cuboid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of cuboid:");
        double l=sc.nextDouble();
        System.out.println("Enter the breadth of cuboid:");
        double b=sc.nextDouble();
        System.out.println("Enter the height of cuboid:");
        double h=sc.nextDouble();
        double area=(2*((l*b)+(b*h)+(h*l)));
        System.out.println("Total surface area of cuboid is:"+area);
    }
}
