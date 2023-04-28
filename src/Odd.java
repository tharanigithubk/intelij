import java.util.Scanner;
public class Odd {
    public static void main(String[] args) {
        int i,n,sum=0;
        System.out.println("Enter number of terms:");
        {
            Scanner in=new Scanner(System.in);
            n=in.nextInt();
            System.out.println("The odd numbers are:");
            for (i=1;i<=n;i++){
                System.out.println(2*i-1);
                sum+=2*i-1;
            }
            System.out.println("sum of odd natural numbers upto:"+n+"terms is:"+sum);
        }
    }
}
