import java.util.Arrays;
public class Missinglet {
    public static void main(String[] args) {
        String[] str_arra = {"m", "n", "p", "q"};
        System.out.printf("\n original array of element:" + Arrays.toString(str_arra));
        String result = test(str_arra);
        System.out.printf("\n missing letter in the said array:" + result);
    }

    public static String test(String[] str_arra) {
        int c = str_arra[0].charAt(0) + 1;
        for (int i = 1; i < str_arra.length; i++,c++)
        if(str_arra[i].charAt(0)!= c)
            return String.valueOf((char) c);
        return "";
    }
}
