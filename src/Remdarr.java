import java.util.Arrays;

public class Remdarr {
    public static void unique_array(int[]arr) {
        System.out.println("original array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "\t");
        }
        int no_unique_elements = arr.length;
        for (int i = 0; i < no_unique_elements; i++) {
            for (int j = i + 1; j < no_unique_elements; j++) {
                if (arr[i] == arr[j]) {
                    arr[j] = arr[no_unique_elements - 1];
                    no_unique_elements--;
                    j--;
                }
            }
        }
        int[] arr1 = Arrays.copyOf(arr,no_unique_elements);
        System.out.println();
        System.out.println("Array with unique value:");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr[i] + "\t");
        }
        System.out.println();
        System.out.println("----------");
    }
    public static void main(String[] args) {
            unique_array(new int[]{0, 1, 2, 3, 2});
            unique_array(new int[]{10, 20, 30, 40, 30});
        }
    }



