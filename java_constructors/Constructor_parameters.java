public class Constructor_parameters {
    int modelYear;
    String modelName;

    public Constructor_parameters(int year, String name){
        modelYear = year;
        modelName = name;
    }
    public static void main(String[] args) {
        Constructor_parameters myCar = new Constructor_parameters(1969, "Mustang");

        System.out.println(myCar.modelYear+" "+myCar.modelName);
    }
}
