package randomWiki;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
/*Create a Stream expression which reads all text from this file,
and prints the 100 most common words in descending order. Keep in mind that the text contains
punctuation characters which should be ignored. The result should be something like this:*/

public class Main {
    public static void main(String[] args) {
        List<String> theContent = readFile("E:\\Programming\\GIT\\1stgit\\greenfox\\LubosTran\\week-06\\day-1\\Stream\\src\\randomWiki\\wiki.txt");

            System.out.println(theContent.get(0));


    }

    public static List<String> readFile(String filename){
        Path path = Paths.get(filename);
        List<String> data = new ArrayList<>();
        try {
            data = Files.readAllLines(path);
        } catch (IOException e) {
            System.out.println("Couldn't read the file");
        }
        return data;
    }
}
