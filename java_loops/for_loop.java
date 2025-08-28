public class for_loop {
    public static void main(String[] args) {
        // for(int i=0 ; i<10 ;i++){
        //     System.out.println(i);
        // }


        int sum =0;
        for(int i=0; i<5; i++){
            sum +=i;
        }
        System.out.println(sum);

        int number = 2;
        for(int i=1;i<=10;i++){
            System.out.println(number + "x" + i + "=" +(i*number));
        }
    }
}
