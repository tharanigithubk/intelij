 abstract class Abstract {
    public String Name="john";
    public int Age=24;
     public int graduationYear = 2013;
     public Abstract(String Name,int Age,int graduationYear){
         this.Name=Name;
         this.Age=Age;
         this.graduationYear=graduationYear;
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
    public int getGraduationYear(){
         return graduationYear;
    }
    public void setGraduationYear(int newGraduationYear){
         this.graduationYear=newGraduationYear;
    }
    public abstract void study();
}
class Students extends Main {
    public void study() {
        System.out.println("studying all day long:");
    }

}







