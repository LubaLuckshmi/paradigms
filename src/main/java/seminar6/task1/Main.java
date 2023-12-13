package seminar6.task1;

import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Stopwatch");
        Stopwatch stopwatch = new Stopwatch();
        ConsoleView consoleView = new ConsoleView(stopwatch);
        consoleView.run();
    }
}
