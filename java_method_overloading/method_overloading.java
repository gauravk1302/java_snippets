public class method_overloading {
    static int myMethod(int x, int y) {
        return x + y;
    }

    static double myMethod(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        int mynum1 = myMethod(3, 7);
        double mynum2 = myMethod(3.5, 7.89);
        System.out.println(mynum1);
        System.out.println(mynum2);
    }
}
