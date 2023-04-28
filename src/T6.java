import java.util.Scanner;
public class T6 {
    public static void main(String[] args){
        int num=60;
        System.out.println("factors of"+num+"are:");
        for(int i=1;i<=num;++i){
            if(num%i==0){
                System.out.println(i+"");
            }
        }

    }
}
