class Vehical {
    protected String brand = "Ford";

    public void honk() {
        System.out.println("Honk Honk!!");
    }
}

class Car extends Vehical {
    private String modelName = "Mustang";

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.honk();
        System.out.println(myCar.brand + " " + myCar.modelName);
    }
}
