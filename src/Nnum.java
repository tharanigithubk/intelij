import java.util.Scanner;
public class Nnum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,sum=0;
        System.out.println("Enter how many numbers you want sum:");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the"+n+"numbers:");
        for (int i=0;i<n;i++){
            System.out.println("Enter the number"+(i+1)+":");
            a[i]=sc.nextInt();
        }
        for (int i=0;i<n;i++){
            sum+=a[i];
        }
        System.out.println("sum of"+n+"numbers is="+sum);

    }
}
