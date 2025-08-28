class Animal{
    String name = "Animal";
}
class Dog extends Animal{
    String name = "Dog";
    
    public void printInfo(){
        System.out.println(super.name);
    }
}
public class Access_parent_attributes{
    public static void main(String[] args) {
        Dog mydog = new Dog();
        mydog.printInfo();
    }
}
