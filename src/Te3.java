public class Te3 {
    static void Age(int age){
        if (age<20) {
            throw new ArithmeticException("degree is BE,ME,and BA is<40 age of teachers as yes:");
        } else {
            System.out.println("degree BE,ME,and BA is>20 age of teachers as no");
        }
    }
    public static void main(String[] args) {
        Age(40);
        String Words="BE,ME,BA";
        int coundwords=Words.split("\s").length;
        System.out.println(coundwords);
    }
}


