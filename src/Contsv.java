public class Contsv {
    public static boolean contains(int[] arr, int item){
        for (int n:arr) {
            if (item == n) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] myArray1 = {
                2,4,6,
                4,8,12,
                5,10};
        System.out.println(contains(myArray1,1));
        System.out.println(contains(myArray1,12));
    }
}






