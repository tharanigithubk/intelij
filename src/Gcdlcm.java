import java.util.Scanner;
public class Gcdlcm {
    public static int gcd(int x, int y) {
        int r = 0, a, b;
        a = (x > y) ? x : y;
        b = (x < y) ? x : y;
        r = b;
        while (a % b != 0);
        {
            r = a % b;
            a = b;
            b = r;
        }
        return r;
    }

    static int lcm(int x, int y) {
        int a;
        a = (x > y) ? x : y;
        while (true)
        {
            if (a%x==0&&a%y== 0)
                return a;
            ++a;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the two number:");
        int x = input.nextInt();
        int y = input.nextInt();
        System.out.println(" the gcd of two numbers:" + gcd(x, y));
        System.out.println("the lcm of two numbers:" + lcm(x, y));
        input.close();
    }
}
