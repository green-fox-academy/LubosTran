import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.File;
import java.util.ArrayList;
import java.io.IOException;
import java.util.List;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;

public class CountLines {
// Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.
    public static void main(String[] args) {
        int NumberOfLines = countLinesInFiles("assets/my-file.txt");
        System.out.println(NumberOfLines);
    }
    public static int countLinesInFiles (String filename) {
        Path filePath = Paths.get("assets/my-file.txt");
        try {
            List<String> lines = Files.readAllLines(filePath);

        int lineCounter =0;
        for (String aLine :lines) {

            lineCounter++;

        } return lineCounter;
        } catch (IOException error) {
            return 0;
        }
    }
}
