public class Distancebw {
    public static void main(String[] args) {
        int x1,x2,y1,y2;
        double dis;
        x1=2;x2=2;y1=6;y2=6;
        dis=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        System.out.println("Distancebetween"+"("+x1+","+y1+"),"+"("+x2+","+y2+")==>"+dis);
    }
}
