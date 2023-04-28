public class Allpairsspecifiedno {
    public static void pairs_value(int inputarray[],int inputnumber)
    {
        System.out.println("pairs of elements and their sum:");
        for (int i=0;i<inputarray.length;i++)
        {
            for (int j=i+1;j<inputarray.length;j++)
            {
                if (inputarray[i]+inputarray[j]==inputnumber)
                {
                    System.out.println(inputarray[i]+"+"+inputarray[j]+"="+inputnumber);

                }
            }
        }
    }
    public static void main(String[] args){
        pairs_value(new int[]{2,4,8,9,14,11},25);
pairs_value(new int[]{16,25,28,12,22},50);
    }
}
