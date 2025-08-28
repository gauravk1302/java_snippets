class Animal{
    public void animalsound(){
        System.out.println("The animal makes sound.");
    }
}
class Dog extends Animal{
     public void animalsound(){
        System.out.println("The dog says: Bow Bow!!");
    }
}
class Cat extends Animal{
     public void animalsound(){
        System.out.println("Cat says: Meow Meow!!");
    }
}
class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myAnimal.animalsound();
        myDog.animalsound();
        myCat.animalsound();
    }
}
