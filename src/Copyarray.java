public class Copyarray {
    public static void main(String[] args){
        int a[]={1,2,3};
        int b[]=new int[a.length];
        b=a;
        b[0]++;
        System.out.println("contents of a[]");
        for(int i=0;i<a.length;i++)
            System.out.println(a[i]+"");
        System.out.println("\n\n contents of b[]");
        for (int i=0;i<b.length;i++)
            System.out.println(b[i]+"");

    }
}
