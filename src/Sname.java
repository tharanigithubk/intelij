import java.util.Scanner;

public class Sname {
    public  static  void main(String[] args){
        Scanner object=new Scanner(System.in);
        System.out.println("Enter the name");
        String name=object.nextLine();
        System.out.println("my name is:"+name);
        System.out.println("Enter the number");
        String number =object.nextLine();
        System.out.println(name +":"+number);

    }


}
