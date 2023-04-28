import java.util.Scanner;
public class Sumoi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the integer");
        int digits = in.nextInt();
        System.out.println("the sum is digits is:" + sumdigits(digits));
    }
    public static int sumdigits(long num){
        int result=0;
        while (num>0){
            result+=num%10;
            num/=10;
        }
        return result;
    }
}
