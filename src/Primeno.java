public class Primeno {
    public static void main(String[] args) {
        for (int i=0;i<30;i++){
            if (isprime(i)) {
                System.out.println(i + "\n");
            }
        }
    }
    public static boolean isprime(int number)
    {
        for (int i=2;i<number;i++) {
            if (number % i == 0)
            {
                return false;
            }
        }
                return true;
            }
        }


