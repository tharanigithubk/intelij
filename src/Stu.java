public class Stu {
    public String Name;
    private int Age, Register_number;
    public  Stu(String Name, int Age, int register_number) {
        this.Name = Name;
        this.Age = Age;
        this.Register_number = register_number;
    }
    public String getName() {
        return Name;
    }
    public void setName(String newName) {
        this.Name = newName;
    }
    public int getAge() {
        return Age;
    }
    public void setAge(int newAge) {
        this.Age = newAge;
    }

    public int getRegister_number(){
        return Register_number;
    }
    public void setRegister_number(int newRegisterNumber){
        this.Register_number = newRegisterNumber;
    }
}



