class Animal{
  public Animal (){
    System.out.println("Animal");
  }
}
class Dog extends Animal{
   public Dog(){
        super();
        System.out.println("Dog");
    }
}
// The call to super() must be the first statement in the subclass constructor.
public class 
Acces_parent_constructor {
    public static void main(String[] args) {
        Dog myDog = new Dog();
    }
}
