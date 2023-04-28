import java.util.Scanner;
public class Equilateral {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the side equilateral triangle:");
        double e=sc.nextDouble();
        double area=(Math.sqrt(3)/4)*(e*e);
        System.out.println("Area of equilateral triangle:"+area);
    }
}
