abstract class Abs {
    abstract void accelerate();
    }
    class Suzuki extends Car{
        void accelerate(){
            System.out.println("Suzuki::accelerate");
        }
    }
    class Main{
        public static void main(String args[]){
            Car obj = new Suzuki();    //Car object =>contents of Suzuki
            obj.accelerate();          //call the method
        }
    }
