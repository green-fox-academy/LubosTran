import java.io.File;
import java.util.ArrayList;
import java.io.IOException;
import java.util.List;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;

public class PrintEachLine {
    public static void main(String[] args) {
        // Write a program that opens a file called "my-file.txt", then prints
        // each line from the file.
        // If the program is unable to read the file (for example it does not exist),
        // then it should print the following error message: "Unable to read file: my-file.txt"

        try { // Required by Files.readAllLines(filePath);
            Path filePath = Paths.get("assets/my-file.txt");
            List<String> lines = Files.readAllLines(filePath);
            for (String fcktheguywritethisinstruction : lines)
            System.out.println(fcktheguywritethisinstruction);
        } catch (Exception e) {
            System.out.println("Uh-oh, could not read the file!");
        }

    }
}