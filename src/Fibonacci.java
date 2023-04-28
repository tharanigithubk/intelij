import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number;
            int firstNumber=0,
                    secondNumber=1,
                    thirdNumber;
        System.out.println("Enter number of terms of series:");
        number=sc.nextInt();
        System.out.println(firstNumber+""+secondNumber+"");
        for (int i=3;i<number;i++){
            thirdNumber=firstNumber+secondNumber;
            System.out.println(thirdNumber+"");
            firstNumber=secondNumber;
            secondNumber=thirdNumber;
        }
    }
}
