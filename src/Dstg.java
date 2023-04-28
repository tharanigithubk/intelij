public class Dstg {
    public static void main(String[] args){
        String[] arr={"ond","tnj","ond","thr","tnj"};
        for(int i=0;i<arr.length-1;i++)
        {
            for (int j=i+1;j<arr.length;j++)
            {
                if((arr[i].equals(arr[j]))&&(i!=j)){

                    System.out.println("Duplicate letter is :"+arr[j]);
                }
            }
        }
    }
}
