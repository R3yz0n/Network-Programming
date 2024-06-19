import java.io.File;
import java.util.Scanner;

public class ReadingLogFile {

    public static void main(String[] args) throws Exception {

        File myFile = new File("logs.txt");
        System.out.println(myFile);
        Scanner fileReader = new Scanner(myFile);
        int i = 1;
        while (fileReader.hasNextLine()) {
            System.out.println(i);
            String data = fileReader.nextLine();
            System.out.println(data);
            i++;
        }
    }

}
