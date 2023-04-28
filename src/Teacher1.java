class Teacher1 {

        private String name;
        private String degree;
    private String location;
    public int std;
    public int age;
    public Teacher1(String name, String degree, String location, int std, int age) {
        this.name = name;
        this.degree = degree;
        this.location = location;
        this.std = std;
        this.age = age;
    }
    public String getName() {
        return this.name;
    }

    public void setName(String var1) {
        this.name = var1;
    }

    public String getLocation() {
        return this.location;
    }
    public void setLocation(String var1) {
        this.location = var1;
    }
    public int getStd() {
        return this.std;
    }
    public void setStd(int var1) {
        this.std = var1;
    }
    public String getDegree(){
        return this.degree;
    }
    public int getAge() {
        return this.age;
    }
    public void setAge(int var1) {
        this.age = var1;
    }
}
