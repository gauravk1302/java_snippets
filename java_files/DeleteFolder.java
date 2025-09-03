import java.io.File;

public class DeleteFolder {
    public static void main(String[] args) {
        File myFile = new File("New folder");
        if (myFile.delete()){
            System.out.println("Deleted Folder: " + myFile.getName());
        }else{
            System.out.println("Failed to delete the folder.");
        }
    }
}
