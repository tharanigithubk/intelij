 abstract class Abstraction {
   public abstract void animalSound();
    public void sleep(){
        System.out.println("Zzz");
    }
}
class Zoo extends Abstraction {
         public void animalSound() {
             System.out.println("The pig says:wee wee");
        }
}


