import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File fileName = new File("C:\\Users\\Vega Laptop\\Documents\\GitHub\\JobHacker-System\\OOPTasks\\Task2\\src\\file.txt"); // replace "filename.txt" with the actual file path
        int count = 0;

        try {
            Scanner file = new Scanner(fileName);

            while (file.hasNextLine()) {
                String line = file.nextLine();
                String[] words = line.split("\\s+");
                count += words.length;
            }

            file.close();
            System.out.println("Number of words: " + count);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}