import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) {
        try {
            FileWriter myObj = new FileWriter("filename1.txt");
            myObj.write("Files in java are tricky, but it is fun ");
            myObj.close();
            System.out.println("Sucessfully wrote the file.");
        } catch (Exception e) {
            System.out.println("An error occur");
            e.printStackTrace();
        }

    }
}
