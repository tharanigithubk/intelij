import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        float tamil, english, result, average;
        Scanner mark = new Scanner(System.in);
        System.out.println("Enter tamil mark:");
        tamil = mark.nextFloat();
        System.out.println("Enter english mark:");
        english = mark.nextFloat();
        System.out.println("Enter result:");
        result = mark.nextFloat();
        average = (tamil + english) / 3;
        if (average >= 90) {
            System.out.println("Grade A:");
        } else if (average >= 70 && average < 90) {
            System.out.println("Grade B:");
        } else if (average >= 50 && average < 70) {
            System.out.println("Grade C:");
        } else if (average > 50) {
            System.out.println("Grade F:");
        } else {
            System.out.println("Invalid:");
        }
    }
}
