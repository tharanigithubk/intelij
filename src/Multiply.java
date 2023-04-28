import java.util.Scanner;
public class Multiply {
    public static void main(String[] args) {
        int i,num;
        {
            System.out.println("Enter the number of terms:");
            Scanner sc=new Scanner(System.in);
            num=sc.nextInt();
            System.out.println("\n");
            for (i=0;i<=num;i++){
                System.out.println(num+"X"+i+"="+num*i);
            }
        }
    }
}
