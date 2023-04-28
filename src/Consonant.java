import java.util.Scanner;
public class Consonant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=0;
        System.out.println("Enter the character:");
        char ch=sc.next().charAt(0);
        if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
            System.out.println("Entered character" + ch + "is vowel");
        } else if ((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
            System.out.println("Entered character"+ch+"is consonant");
            else
        {
            System.out.println("Not an alphabet:");
        }
    }
}
