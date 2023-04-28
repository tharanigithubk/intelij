public class Factorialur {
    static int factorialofnumbers(int n) {
        if (n == 0)
            return 1;

            return (n * factorialofnumbers(n - 1));
    }

    public static void main(String[] args) {
        int fact = 1;
        int number = 8;
        fact = factorialofnumbers(number);
        System.out.println("Factorial of" + number + "is:" + fact);
    }
}





