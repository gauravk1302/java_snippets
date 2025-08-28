public class Object_classes {
    int x = 5;

    static class Second {
        double y = 7.54;
    }

    public static void main(String[] args) {
        Object_classes myObject1 = new Object_classes();
        Second myObject2 = new Second();
        System.out.println(myObject1.x);
        System.out.println(myObject2.y);
    }

}
// public class Object_classes {
// int x = 5;

// class Second {
// double y = 7.54;
// }

// public static void main(String[] args) {
// Object_classes myObject1 = new Object_classes();
// Object_classes.Second myObject2 = myObject1.new Second();

// System.out.println(myObject1.x);
// System.out.println(myObject2.y);
// }
// }
