import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1,num2,num3;
        for (int number=1;number<=100;number++){
            int temp=number;
            num1=temp%10;
            temp=temp/10;
            num2=temp%10;
            temp=temp/10;
            num3=temp%10;
            if (num1*num1*num1+num2*num2*num2+num3*num3*num3==number){
                System.out.println(number);
            }
        }
    }
}
