import java.util.Scanner;
public class Pentagon {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the number of side:");
        int n=in.nextInt();
        System.out.println("input side:");
        double side=in.nextDouble();
        System.out.println("area of the pentagon"+pentagonarea(n,side));
    }
    public static double pentagonarea(int n,double s){
        return (n*s*s)/(4*Math.tan(Math.PI/n));
    }
}
