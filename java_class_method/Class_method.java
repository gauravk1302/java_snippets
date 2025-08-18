public class Class_method {
     static void myStaticMethod(){
        System.out.println("Static methods can be called without creating objects");
     }   

     public void myPublicMethod(){
        System.out.println("Public method must be called using objects");
     }

     public static void main(String[] args){
        myStaticMethod();

        Class_method myObj = new Class_method();
        myObj.myPublicMethod();
     }
}
