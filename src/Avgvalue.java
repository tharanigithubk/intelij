public class Avgvalue {
    public static void main(String[] args) {
        int[] numbers = new int[]{10, 20, 30, -40,100};
        int sum = 0;
        for ( int i=0; i < numbers.length;i++)
            sum = sum + numbers[i];
        double average = sum /numbers.length;
        System.out.println("average value of the array elements is:" + average);
    }
}
