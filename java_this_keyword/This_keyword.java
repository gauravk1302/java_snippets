public class This_keyword {
    int x;

    public This_keyword (int x){
        this.x = x;
    }

    public static void main (String[] args){
        This_keyword myObj = new This_keyword(10);
        System.out.println("Value of x is: "+ myObj.x);
    }
}
