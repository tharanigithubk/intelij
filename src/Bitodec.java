import java.util.Scanner;
public class Bitodec {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long binarynumber,decimalnumber=0,rem,j=1;
        System.out.println("enter a decimal number:");
        binarynumber =sc.nextLong();
        while (binarynumber!=0)
            {
                rem = binarynumber % 10;
                decimalnumber = decimalnumber + rem * j;
                j = j * 2;
                binarynumber = binarynumber / 10;
            }
            System.out.println("decimal number is:"+decimalnumber);
            }
        }


