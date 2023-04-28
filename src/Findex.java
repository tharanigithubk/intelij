public class Findex {
    public static int findIndex(int[] arr,int t) {
        if (arr == null) return -1;
        int len = arr.length;
        int i = 0;
        while (i < len) {
            if (arr[i] == t) return i;
            else i = i + 1;
        }
        return -1;
    }
    public static void main(String[] args){
        int[]arr={5,10,15,20,25};
        System.out.println("index position of 10 is:"+findIndex(arr,10));
        System.out.println("index position of 20 is:"+findIndex(arr,20));
        }
    }

