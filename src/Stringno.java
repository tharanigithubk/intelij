public class Stringno {
    public static void main(String[] args) {
        String test="@TechStudy.org 12345";
        count(test);
    }
    public static void count(String x) {
        char[]ch=x.toCharArray();
        int letter=0,space=0;
        int num=0,OtherChat=0;
        for (int i=0;i<x.length();i++){
            if (Character.isLetter(ch[i])){
                letter ++;
            } else if (Character.isDigit(ch[i])) {
                num ++;
            } else if (Character.isSpaceChar(ch[i])) {
                space ++;
            }else {
                OtherChat ++;
            }
        }
        System.out.println("The string is:@TechStudy.org 123456");
        System.out.println("Letter"+letter);
        System.out.println("Space"+space);
        System.out.println("Number"+num);
        System.out.println("Other"+OtherChat);
    }
}
