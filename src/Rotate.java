public class Rotate {
    public static boolean sum_pair(int arr_int[],int n,int x)
    {
        int k;
        for (k=0;k<n-1;k++)
            if (arr_int[k]>arr_int[k+1])
                break;;
                int l=(k+1)%n;
                int r=k;
                while (l!=r) {
                    if (arr_int[l] + arr_int[r] == x)
                        return true;
                    if (arr_int[l] + arr_int[r] < x)
                        l = (l + 1) % n;
                    else
                        r = (n + r - 1) % n;}
                    return false;
                }
                public static void main(String[] args){
                    int arr_int[]={22,13,14,15,16};
                    int sum=68;
                    int n= arr_int.length;
                    if (sum_pair(arr_int,n,sum))
                        System.out.print("Array has a pair of element with sum 68.");
                        System.out.print("Array has a no pair with sum 68.");
                }
}
