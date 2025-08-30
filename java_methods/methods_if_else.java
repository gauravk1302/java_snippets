public class methods_if_else {
    static void myMethod(int age) {
        if (age < 18) {
            System.out.println("You are underAge");
        } else {
            System.out.println("You are allowed");
        }
    }

    public static void main(String[] args) {
        myMethod(13);
    }

}
