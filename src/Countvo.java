import java.util.Scanner;
public class Countvo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("input the string:");
        String str = in.nextLine();
        System.out.println("Number of vowels in the String:" + countVowels(str) + "\n");
    }
    public static int countVowels(String str)
    {
        int count = 0;
        for (int i = 0;i < str.length();i++)
        {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                count++;
            }

        }
            return count;
        }
    }

