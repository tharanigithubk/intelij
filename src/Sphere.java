import java.util.Scanner;
public class Sphere {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of sphere is:");
        double r=sc.nextDouble();
        double volume=(4*22*r*r*r)/(3*7);
        double volume1=4*r*r;
        System.out.println("Area of volume of sphere:"+volume);
        System.out.println("Curved surface area of cube is:"+volume1);
    }
}
