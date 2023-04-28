public class Derlrearr {
    public static void main(String[] args){
        int nums[]={10,10,20,30,40,40,40};
        System.out.println("oarrl:"+nums.length);
        System.out.println("array elements are:");
        for (int i=0;i<nums.length;i++)
        {
            System.out.println(nums[i]+"");
        }
        System.out.println("\n the new length of the array is:"+array_sort(nums));
    }
    public static int array_sort(int[]nums){
        int index=1;
        for (int i=1;i<nums.length;i++) {
            if (nums[i]!=nums[index-1])
                nums[index++] = nums[i];
        }
        return index;
    }
}

