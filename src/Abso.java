import java.util.Scanner;
public class Abso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a float number:");
        Float x = sc.nextFloat();
        System.out.println("The absolute value of %.2f is:%.2f"+x+convert(x));
        System.out.println("\n");
    }
    public static float convert(float n)
    {
        float absolutevalue=(n>=0)?n:-n;
        return absolutevalue;
    }
}
