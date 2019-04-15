import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;


public class WriteSingleLine {
    public static void main(String[] args) {
        // Write a function that is able to manipulate a file
        // By writing your name into it as a single line
        // The file should be named "my-file.txt"
        // In case the program is unable to write the file,
        // It should print the following error message: "Unable to write file: my-file.txt"
        functionToWrite("assets/my-file.txt");
    }
    public static void functionToWrite (String filename){
        Path filePath = Paths.get("assets/my-file.txt");
        String fileContent = "Lubos";
        try {
            Files.write(filePath, fileContent.getBytes());
        }catch (IOException error) {
            System.out.println("\"Cant write for shit\"");
        }
    }
}