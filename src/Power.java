public class Power {
    public static void main(String[] args) {
        int base=9,exponent=2;
        long result=1;
        while (exponent!=0){
            result*=base;
            --exponent;
        }
        System.out.println("Answer="+result);
    }
}
