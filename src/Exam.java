public class Exam {
    public static void main(String[] args) {
      int held=30,attendance=45;
      int percent=100;
      if (held<=attendance) {
          System.out.println("Number of classes held:");
      } else {
          System.out.println("Number of classes attended:");
      }
      if (percent<=75) {
          System.out.println("percentage of class attended:");
      }else{
          System.out.println("Is student is allowed to sit in exam or not:");

      }
    }
}
