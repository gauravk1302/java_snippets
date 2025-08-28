class OuterClass {
    int x = 10;

    class InnerClass {
        int y = 5;
    }
}
// if you make it private this inner class you can't acess it outside that will give an error

public class Main {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        System.out.println(outer.x + inner.y);
    }
}
