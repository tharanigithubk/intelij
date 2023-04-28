import java.util.Scanner;
public class Tha {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("NAME");

        String name=sc.nextLine();
        char gender=sc.next().charAt(3);
        System.out.println("GENDER:"+gender);
        int age=sc.nextInt();
        System.out.println("AGE:"+age);
        long mobileNo=sc.nextLong();
        System.out.println("number:"+mobileNo);
        double cgpa=sc.nextDouble();
        System.out.println("CGPA:"+cgpa);




    }
}
