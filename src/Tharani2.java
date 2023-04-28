import java.util.Scanner;

public class Tharani2 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the x value");
        int x = scan.nextInt();
        System.out.println("enter the y value");
        int y = scan.nextInt();
        int z=x*y;
        System.out.println("multiplication:"+z);
    }
}
