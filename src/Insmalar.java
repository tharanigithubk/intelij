public class Insmalar {
    public static void main(String[] args){
        int numbers[]=new int[]{5,10,15,20,25,30};
        int smallest=numbers[0];
        int largest=numbers[0];
        for(int i=1;i<numbers.length;i++) {
            if (numbers[i] > largest)
                largest = numbers[i];
            else if (numbers[i]<smallest)
                smallest = numbers[i];
        }
        System.out.println("largest number is :"+largest);
        System.out.println("smallest number is :"+smallest);
    }
}
