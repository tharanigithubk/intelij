public class Sumvalue {
    public static void main(String[] args){
        int[] a=new int[5];
        for(int i=0;i<a.length;i++)
            a[i]=i;
        int sum=0;
        for(int j:a)sum+=j;
        System.out.println(sum);
    }
}
