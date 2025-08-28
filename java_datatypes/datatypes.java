public class datatypes {
    public static void main(String[] args) {
        byte myNum = 100;
        System.out.println(myNum);
        short myNum1 = 5000;
        System.out.println(myNum1);
        double myNum2 = 19.99d;
        System.out.println(myNum2);
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun);
        System.out.println(isFishTasty);

        char myGrade = 'A';
        System.out.println(myGrade);

        char mygrade1 = 66;
        System.out.println(mygrade1);

        String greeting = "Hello World";
        System.out.println(greeting);


        int items = 50;
        float costperItem = 9.99f;
        float totalCost = items *costperItem;
        char currency = '$';

        System.out.println("No. of items: " + items);
        System.out.println("Cost per item: " + costperItem +  currency);
        System.out.println("Total cost = " + totalCost + currency);
        }
}
