public class Attributes {
    int x = 30 ;

    public static void main (String[] args){
       Attributes myObject = new Attributes();
       myObject.x = 40;
       // if you din't want to override then use final keyword
       System.out.println(myObject.x); 
    }
}
