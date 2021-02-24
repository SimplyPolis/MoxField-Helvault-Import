import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(new File(args[0]));
            scan.useDelimiter("\",\"");
            String[] list = new String[9];
            scan.nextLine();
            while (scan.hasNext()) {
                for (int i = 0; i < 8; i++) {
                    list[i] = scan.next();

                }
                System.out.println(list[5] + " " + list[3] + " (" + list[7].toUpperCase() + ")");
            }
        } catch (Exception e) {

        }

    }
}
