import Logic.PerfectNumberFinder;
import View.ConsoleInput;
import View.ConsolePrinter;

public class Main {

    public static void main(String[] args) {

        int number ;

        PerfectNumberFinder perfectNumberFinder = new PerfectNumberFinder();
        ConsolePrinter consolePrinter = new ConsolePrinter();
        ConsoleInput consoleInput = new ConsoleInput();

        number = consoleInput.input("Enter your number ");
        consolePrinter.print("Answer is " + PerfectNumberFinder.isPerfectNumber(number));


    }

}
