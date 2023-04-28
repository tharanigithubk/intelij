public class Cgpa {
    public static void main(String[] args) {
        int num=5;
        double m[]=new double[num];
        double g[]=new double[num];
        double cgpa,sum=0;
        m[0]=88;
        m[1]=90;
        m[2]=78;
        m[3]=89;
        m[4]=67;
        for (int i=0;i<num;i++){
            g[i]=(m[i]/10);
        }
        for (int i=0;i<num;i++){
            sum+=g[i];
        }
        cgpa=sum/num;
        System.out.println("CGPA="+cgpa);
        System.out.println("percentage from CGPA="+cgpa*9.5);
    }
}
