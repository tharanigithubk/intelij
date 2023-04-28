import java.math.BigDecimal;
import java.lang.*;
public class Fexe {
    public static void main(String[] args) {
        float num=12345.56789f;
        int decimal_place=3;
        BigDecimal bd_num=new BigDecimal(Float.toString((num)));
        bd_num=bd_num.setScale(decimal_place,BigDecimal.ROUND_HALF_UP);
        System.out.println("Original number:%.7f\n"+num);
        System.out.println("Rounded upto 3 decimal:"+bd_num);
    }
}
