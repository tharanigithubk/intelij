import java.util.*;
    public class Ba {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String[]name={"tharani","rama","deiva","hari","kani"};
            System.out.println("enter the name a");
            String a=scan.nextLine();
            for(int i=0;i<=name.length;i++){
                if(name[i].equals(a)){
            continue;
        }
            System.out.println(name[i]);
    }
}
}