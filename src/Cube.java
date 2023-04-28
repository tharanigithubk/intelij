import java.util.Scanner;
public class Cube {
    public static void main(String[] args) {
        int i,n;
        System.out.println("Enter number of terms:");
        Scanner num=new Scanner(System.in);
        n=num.nextInt();
        for (i=0;i<=n;i++){
            System.out.println("cube of:"+i+"is:"+(i*i*i));
        }
    }
}
