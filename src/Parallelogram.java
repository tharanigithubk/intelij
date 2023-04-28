import java.util.Scanner;
public class Parallelogram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the height:");
        double a=sc.nextDouble();
        System.out.println("Enter the breadth:");
        double b=sc.nextDouble();
        double area=(a*b);
        double area1=(a*b);
        double area2=((22*a*a*b)/7);
        double area3=(22*a*a*b)/(3*7);
        double area4=((2*22*a)/7)*(a+b);
        System.out.println("Area of parallelogram:"+area);
        System.out.println("Area of volume of prim is:"+area1);
        System.out.println("volume of the Cylinder is:"+area2);
        System.out.println("volume of cone is:"+area3);
        System.out.println("Total surface area of Cylinder is:"+area4);
    }
}
