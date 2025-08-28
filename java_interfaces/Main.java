interface Animal{
    public void animalsound();
    public void sleep();
}
class Dog implements Animal{
    public void animalsound(){
        System.out.println("Dog barks.");
    }
    public void sleep(){
        System.out.println("Zzzzz..");
    }
}
public class Main {

    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.animalsound();
        myDog.sleep();
    }
}