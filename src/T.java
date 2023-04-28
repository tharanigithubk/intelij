public class T {
    public static void main(String[] args) {
        Teacher1 obj1 = new Teacher1("tharani", "be", "ond", 1,25);
        System.out.println("name a is:" + obj1.getName());
        System.out.println("degree:" + obj1.getDegree());
        System.out.println("location:" + obj1.getLocation());
        System.out.println("std:" + obj1.getStd());
        System.out.println("age:" + obj1.getAge());
        Teacher1 obj2 = new Teacher1("kama", "me", "tnj", 2, 24);
        System.out.println("name a is:" + obj2.getName());
        System.out.println("degree:" + obj2.getDegree());
        System.out.println("location:" + obj2.getLocation());
        System.out.println("std:" + obj2.getStd());
        System.out.println("age:" + obj2.getAge());
        Teacher1 obj3 = new Teacher1("lakshmi", "be", "ond", 1, 25);
        System.out.println("name a is:" + obj3.getName());
        System.out.println("degree:" + obj3.getDegree());
        System.out.println("location:" + obj3.getLocation());
        System.out.println("std:" + obj3.getStd());
        System.out.println("age:" + obj3.getAge());
        Teacher1 obj4 = new Teacher1("kani", "me", "ond", 9, 26);
        System.out.println("name a is:" + obj4.getName());
        System.out.println("degree:" + obj4.getDegree());
        System.out.println("location:" + obj4.getLocation());
        System.out.println("std:" + obj4.getStd());
        System.out.println("age:" + obj4.getAge());
        Teacher1 obj5 = new Teacher1("rama", "be", "tnj", 5, 27);
        System.out.println("name a is:" + obj5.getName());
        System.out.println("degree:" + obj5.getDegree());
        System.out.println("location:" + obj5.getLocation());
        System.out.println("std:" + obj5.getStd());
        System.out.println("age:" + obj5.getAge());
        Teacher1 obj6 = new Teacher1("deiva", "me", "ond", 6, 24);
        System.out.println("name a is:" + obj6.getName());
        System.out.println("degree:" + obj6.getDegree());
        System.out.println("location:" + obj6.getLocation());
        System.out.println("std:" + obj6.getStd());
        System.out.println("age:" + obj6.getAge());
        Teacher1 obj7 = new Teacher1("hari ", "me", "ond", 9, 25);
        System.out.println("name a is:" + obj7.getName());
        System.out.println("degree:" + obj7.getDegree());
        System.out.println("location:" + obj7.getLocation());
        System.out.println("std:" + obj7.getStd());
        System.out.println("age:" + obj7.getAge());
        Teacher1 obj8 = new Teacher1("prabakar", "ba", "tnj", 8, 30);
        System.out.println("name a is:" + obj8.getName());
        System.out.println("degree:" + obj8.getDegree());
        System.out.println("location:" + obj8.getLocation());
        System.out.println("std:" + obj8.getStd());
        System.out.println("age:" + obj8.getAge());
        Teacher1 obj9 = new Teacher1("saranya", "ba", "ond", 9, 25);
        System.out.println("name a is:" + obj9.getName());
        System.out.println("degree:" + obj9.getDegree());
        System.out.println("location:" + obj9.getLocation());
        System.out.println("std:" + obj9.getStd());
        System.out.println("age:" + obj9.getAge());
        Teacher1 obj10 = new Teacher1("priya", "ba", "tnj", 10, 32);
        System.out.println("name a is:" + obj10.getName());
        System.out.println("degree:" + obj10.getDegree());
        System.out.println("location:" + obj10.getLocation());
        System.out.println("std:" + obj10.getStd());
        System.out.println("age:" + obj10.getAge());
    }
}
    class teacher{
    private String name,degree,location;
    public int std,age;
    teacher(String name,String degree,String location,int std,int age){
        this.name=name;
        this.degree=degree;
        this.location=location;
        this.std=std;
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public void setName(String newName) {
        this.name = newName;
    }
    public String getDegree(){
      return degree;
    }
    public void setDegree(String newDegree){
        this.degree=newDegree;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String newLocation) {
        this.location = newLocation;
    }
    public int getStd() {
        return std;
    }
    public void setStd(int newStd) {
        this.std = newStd;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int newAge){
        this.age=newAge;
     }
}


