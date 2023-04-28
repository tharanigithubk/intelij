import java.util.Scanner;
public class Areaot {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("input side1:");
        double side1=in.nextDouble();
        System.out.println("input side2:");
        double side2=in.nextDouble();
        System.out.println("input side3:");
        double side3=in.nextDouble();
        System.out.println(isvalid(side1,side2,side3)?"the area of the triangle"+areaoftriangle(side1,side2,side3):"invalid triangle");
    }
    public static boolean isvalid(double side1,double side2,double side3) {
        if (side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2)
            return true;
        else return false;
    }
    public static double areaoftriangle(double side1,double side2,double side3){
        double area=0;
        double s=(side1+side2+side3)/2;
        area=Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        return area;
    }
}
