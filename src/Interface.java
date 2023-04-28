import javax.swing.*;

public class Interface {
      public void animalSound(){
          System.out.println("The pig says:wee wee");
      }
      public void sleep(){
          System.out.println("Zzz");
      }
}

class Pig implements Animal{
    public void animalSound(){
        System.out.println("The Pig says:wee wee");
    }
    public void sleep(){
        System.out.println("Zzz");
    }
}



