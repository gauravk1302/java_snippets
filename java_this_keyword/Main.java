// Calling a constructor from another constructor


public class Main {
    int modelYear ;
    String modelName;
    
    public Main (String modelName){
        this(2020,modelName);
        //calling of second constructor
    }
    
    public Main (int modelYear , String modelName){
        this.modelYear = modelYear;
        this.modelName = modelName;
    }
    

    public void printInfo(){
        System.out.println(modelYear +" "+ modelName);
    }

    public static void main(String[] args) {
        Main car1 = new Main("Corvette");
        Main car2 = new Main(
            1969, "Mustang");

            car1.printInfo();
            car2.printInfo();
    }
}
