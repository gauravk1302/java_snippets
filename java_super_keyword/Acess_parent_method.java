class Animal {
    public void animalSound(){
        System.out.println("Animal makes sound.");
    }
}
class Dog extends Animal{
    public void animalSound(){
        super.animalSound();
        System.out.println("The dog barks.");
    }
}
public class Acess_parent_method{
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.animalSound();
    }
}