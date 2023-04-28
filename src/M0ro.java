public class M0ro {
    public static void main(String[] args) throws Exception {
        int[] arrays_nums = {0,0,1,0,2,0,3};
        int i = 0;
        System.out.print("\n original arr:\n");
        for (int n : arrays_nums)
            System.out.print(n + "");
        for (int j =0,l=arrays_nums .length;j<l;){
            if (arrays_nums[j]==0)
                j++;
            else {
                int obj = arrays_nums [i];
                arrays_nums [i] = arrays_nums [j];
                arrays_nums [j] = obj;
                i++;
                j++;
            }
        }
        while (i <arrays_nums .length)
            arrays_nums [i++] = 0;
        System.out.print("\n After moving 0's to the end of the array:\n");
        for (int n:arrays_nums )
            System.out.print(n + "");
        System.out.print("\n");
    }
}

