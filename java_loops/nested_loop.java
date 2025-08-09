public class nested_loop {
    public static void main(String[] args) {
        // for(int i=0; i<=2; i++){
        //     System.out.println("/outer:" + i);
        //     for(int j=1; j<=3; j++){
        //         System.out.println("inner:" +j);
        //     }
        // }


        for(int i=1; i<=3;i++){
            for(int j=1; j<=3; j++){
                System.out.print(i*j +" ");
            }
            System.out.println();
        }
    }
}
