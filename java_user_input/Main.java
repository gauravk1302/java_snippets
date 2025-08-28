import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the username:");
        String name = myObj.nextLine();

        System.out.println("Enter the age:");
        int age = myObj.nextInt();


        System.out.println("Enter the salary:");
        double salary = myObj.nextDouble();



        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}