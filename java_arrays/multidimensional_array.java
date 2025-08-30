public class multidimensional_array {
    public static void main(String[] args) {
<<<<<<< HEAD
        int[][] myNumbers = { { 1, 2, 3, 4 }, { 5, 6, 7 } };

        System.out.println(myNumbers[1][2]);

        // to change the value of any element
        myNumbers[1][2] = 9;
        System.out.println(myNumbers[1][2]);

        // for looping through an array
        int[][] myNumbers1 = { { 1, 2, 3, 4 }, { 5, 6, 7 } };
        for (int i = 0; i < myNumbers1.length; i++) {
            for (int j = 0; j < myNumbers1[i].length; j++)
                System.out.println(myNumbers1[i][j]);
        }

        // loop through an array using for-each method
        int[][] myNumbers2 = { { 1, 2, 3, 4 }, { 5, 6, 7 } };
        for (int[] row : myNumbers2) {
            for (int i : row) {
                System.out.println(i);
            }
        }
=======
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };

        System.out.println(myNumbers[1][2]);

        //to change the value of any element 
        myNumbers[1][2] =9;
        System.out.println(myNumbers[1][2]);

        
>>>>>>> a8b3817 (Initial commit)
    }
}
