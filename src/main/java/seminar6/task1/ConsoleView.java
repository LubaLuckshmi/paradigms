package seminar6.task1;

import java.util.Scanner;

public class ConsoleView {
    private Stopwatch stopwatch;
    private Scanner scanner;

    public ConsoleView(Stopwatch stopwatch) {
        this.stopwatch = stopwatch;
    }
    public void run() throws InterruptedException {
        System.out.println("Секундомер");
        stopwatch.start();
        Thread.sleep(1000);
        System.out.println("Прошло секунд от старта: "+stopwatch.printCurrentTime()/1000);
        Thread.sleep(1000);
        stopwatch.pause();
        System.out.println("Прошло секунд: "+stopwatch.printCurrentTime()/1000);
        Thread.sleep(1000);

        System.out.println("Прошло секунд: "+stopwatch.printCurrentTime()/1000);
        stopwatch.unPause();

        Thread.sleep(2000);
        System.out.println("Прошло секунд: "+stopwatch.printCurrentTime()/1000);
        stopwatch.stop();
        System.out.println("Прошло секунд: "+stopwatch.printCurrentTime()/1000);

    }
}
