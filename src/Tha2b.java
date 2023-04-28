public class Tha2b {
   public static void main(String[] args){
   int a=6,b=5;
   System.out.println("before swap");
   System.out.println("a= " + a);
   System.out.println("b= " + b);
   int obj=a;
   a = b;
   b = obj;
      System.out.println("after swap");
      System.out.println(" a=" + a);
      System.out.println(" b="+ b);
   }
}