import java.util.Scanner;
public class Countw {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("input the string");
        String str = in.nextLine();
        System.out.println("Number of words in the String:" + countwords(str) + "\n");
    }
    public static int countwords(String str)
    {
        int count = 0;
        if (!("".equals(str.substring(0, 1))) || !("".equals(str.substring(str.length() - 1))))
        {
            for (int i = 0; i < str.length(); i++)
            {
                if (str.charAt(i)==' ')
                {
                    count++;
                }
            }
            count = count + 1;
        }
        return count;
    }
}
