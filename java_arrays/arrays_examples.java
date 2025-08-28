public class arrays_examples {
   public static void main(String[] args) {
    int[] ages ={20,22,18,35,48,26,87,70};
    float sum=0,avg;

    int length = ages.length;
     
    for(int age: ages){
        sum += age;
    }

    avg = sum/length;

    System.out.println("The average age is" + avg);


    int lowestAge = ages[0];

    for(int age: ages){
        if(lowestAge>age){
            lowestAge =age;
        }
    }
    System.out.println("The lowest age in the array is:" + lowestAge);
   } 
}
