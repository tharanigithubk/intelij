public class Car {
    protected String Brand;
    private String modelName;
    Car(String brand,String modelName) {
        this.Brand = brand;
        this.modelName = modelName;
    }
    public String getBrand(){
        return Brand;
    }
    public void setBrand(String newBrand){
        this.Brand=newBrand;
    }
    public String getModelName(){
        return modelName;
    }
    public void setModelName(String newModelName){
        this.modelName=newModelName;
    }
    }
