import java.util.Scanner;
public class Vowel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any alphabet:");
        String str=sc.next().toLowerCase();
        boolean uppercase=str.charAt(0)>=65&&str.charAt(0)<=90;
        boolean lowercase=str.charAt(0)<=97&&str.charAt(0)<=122;
        boolean vowels=str.equals("a")||str.equals("e")||str.equals("i")||str.equals("o")||str.equals("u");
        if (str.length()>1) {
            System.out.println("Error not a single character.");
        } else if (!(uppercase||lowercase))
        {
            System.out.println("Error.Not a letter.Enter uppercase or lowercase letter.");
        } else if (vowels) {
            System.out.println("Input letter is vowels:");
        }
        else {
            System.out.println("Input letter is consonant:");
        }
    }
}

