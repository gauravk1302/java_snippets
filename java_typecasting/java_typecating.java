public class java_typecating {
    public static void main(String[] args) {
        int myInt = 9;
        double myDouble = myInt;

        System.out.println(myInt);
        System.out.println(myDouble);

        //this is a example of widening typecasting


        double myDouble1 = 8.75d;
        int myInt1 = (int) myDouble1;

        System.out.println(myInt1);

        //this is a example of narrow typecasting 

        int userScore = 423;
        int maxScore = 500;

        float percentage = (float) userScore/maxScore *100;
        
        System.out.println("The percentage is: " +percentage);
    }
}