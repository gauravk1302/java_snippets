abstract class Animal {
    public abstract void animalSound();
    public void sleep(){
        System.out.println("Zzzzz...");
    }
    
}

class Dog extends Animal{
    public void animalSound(){
        System.out.println("Dog barks.");
    }
}

public class Main {
   public static void main(String[] args) {
    Dog myDog = new Dog();
    myDog.animalSound();
    myDog.sleep();
   }   
}
