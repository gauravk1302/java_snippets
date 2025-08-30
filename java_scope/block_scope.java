public class block_scope {
    public static void main(String[] args) {
        {
            int x = 100;
        }

        System.out.println(x);

    }
}
// this is an example of block scope here the example will show an error as x can only be accessed in its scope 