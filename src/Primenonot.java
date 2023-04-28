import java.util.Scanner;
public class Primenonot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number;
        System.out.println("Enter the positive number:");
        number=sc.nextInt();
        boolean prime=true;
        for (int i=2;i<number;i++){
            if (number%i==0){
                prime=false;
                break;
            }
        }
        if (prime&&number>1){
            System.out.println("Number is prime:");
        }
        System.out.println("Number is not a prime:");
    }
}
