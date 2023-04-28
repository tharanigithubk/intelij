public class Tequ2arr {
    public static void  equality_checking_two_arrays(int[]arr1,int[]arr2)
    {
        boolean equalornot=true;
        if(arr1.length==arr2.length)
        {
            for (int i=0;i<arr1.length;i++)
            {
                if (arr1[i]!=arr2[i])
                {
                    equalornot=false;
                }
            }
        }
        else
        {
            equalornot=false;
        }
        if (equalornot) {
            System.out.println("Two arrays are equal.");
        }
        else
        {
            System.out.println("Two arrays are not equal.");

        }
    }
    public static void main(String[] args){
        int []arr1={1,2,3,4,5};
        int []arr2={1,2,3,4,5};
        int []arr3={1,2,3,4,5};
        equality_checking_two_arrays(arr1,arr2);
        equality_checking_two_arrays(arr1,arr3);
    }
}

