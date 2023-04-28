import java.util.Scanner;
public class Th4
{
    public static void main(String[] args)
    {
        int numberone,numbertwo,largest;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the first number: ");
        numberone=scan.nextInt();
        System.out.println("enter the second number: ");
        numbertwo=scan.nextInt();

        if(numberone>numbertwo)
            largest=numberone;
            else
            largest=numbertwo;
        System.out.println("\n largest="+largest);
    }
}
