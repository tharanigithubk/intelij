public class Duparr {
    public static void main(String[] args){
        int []arr={1,2,3,2,1};
        for(int i=0;i<arr.length-1;i++)
        {
            for (int j=i+1;j<arr.length;j++)
            {
              if ((arr[i]==arr[j])&&(i!=j))
                {
                  System.out.println("Duplicate value:"+arr[j]);
                }
            }
        }
    }
}
