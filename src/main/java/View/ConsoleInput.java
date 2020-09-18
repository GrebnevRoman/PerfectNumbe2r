package View;
import java.util.Scanner;
public class ConsoleInput implements Input{

    private  static Scanner scanner = new Scanner(System.in);

    public  int input(String  message) {
        System.out.println(message);
        return scanner.nextInt();
    }
}

