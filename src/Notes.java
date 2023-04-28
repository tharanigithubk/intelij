import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Notes {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int Rs[]={2000,500,200,100,50,20,10};
        System.out.println("Enter any amount:");
        int amount=Integer.parseInt(br.readLine());
        int copy=amount;
        int totalNotes=0,count=0;
        System.out.println("Rs.money:\n");
        for (int i=0;i<=0;i++){
            count=amount/Rs[i];
            if (count!=0)
            {
                System.out.println(Rs[i]+"\tx\t"+count+"\t="+Rs[i]*count);
            }
            totalNotes=totalNotes+count;
            amount=amount%Rs[i];
        }
        System.out.println("----------------------------------------");
        System.out.println("Total\t\t\t="+copy);
        System.out.println("----------------------------------------");
        System.out.println("Total number of Notes\t="+totalNotes);
    }
}
