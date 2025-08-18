public class Multiple_objects {
    int x =5;
    
    public static void main(String[] args) {
        Multiple_objects myObj1 = new Multiple_objects();
        Multiple_objects myObj2 = new Multiple_objects();
        myObj2.x =25;
           System.out.println(myObj1.x);
    System.out.println(myObj2.x);
    }
}
