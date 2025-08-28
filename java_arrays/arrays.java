import java.util.Arrays;

public class arrays{
    public static void main (String[] args){
        String[] cars ={"Valvo", "BMW", "Toyota", "Ford"};
        int[] myNum = {1,2,3,4,5};


        // to access the element of the arrays use index
        System.out.println(cars[1]);
        
        
        //to change the array element
        cars[0] = "Opel";
        System.out.println(Arrays.toString(cars));


        //to get the length of the array
        System.out.println(cars.length);
        System.out.println(myNum.length);

       //to loop through an array 
       for(int i=0; i<cars.length; i++){
        System.out.println(cars[i]+" ");
       }

       //for each method to loop through an array
       for(String i: cars){
        System.out.println( i);
       }



       


    }
}