interface FirstInterface{
    public void myMethod1();
}
interface SecondInterface{
    public void myMethod2();
}
class DemoClass implements FirstInterface,SecondInterface{
    public void myMethod1(){
        System.out.println("some text.");
    }
    public void myMethod2(){
        System.out.println("Other text.");
    }
}
public class Multiple_interference {
  public static void main(String[] args) {
    DemoClass myObj = new DemoClass();
    myObj.myMethod1();
    myObj.myMethod2();
  }
    
}

