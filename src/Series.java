import java.util.Scanner;
public class Series {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n=sc.nextInt();
        double sum=0;
        for (int i=0;i<=n;i++){
            sum+=1.0/i;
            System.out.println();
        }
        System.out.println("The sum of the series is:"+sum);
    }
}
