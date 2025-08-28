public class Main {
    public void fullthrottle(){
        System.out.println("The car is going as fast as it can!");
    }
    public void speed (int maxSpeed){
        System.out.println("Max speed is: "+ maxSpeed);
    }
}

class second{
    public static void main(String[] args) {
        Main myObj = new Main();
        myObj.fullthrottle();
        myObj.speed(200);
    }
}
