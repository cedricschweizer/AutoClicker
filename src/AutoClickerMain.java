import java.awt.event.InputEvent;
import java.util.Scanner;

public class AutoClickerMain {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----AutoClicker-----");

        System.out.print("Enter number of clicks: ");
        int clicks = scanner.nextInt();

        System.out.print("Enter delay between clicks in ms: ");
        int delay = scanner.nextInt();
        System.out.println();

        System.out.println("---WARNING--- Program will start in: ");
        for (int i = 3; i > 0; i--) {
            System.out.println(i + "...");
            Thread.sleep(1000);
        }

        AutoClicker clicker = new AutoClicker();
        clicker.setDelay(delay);

        for (int i = 0; i < clicks; i++) {
            clicker.clickMouse(InputEvent.BUTTON1_DOWN_MASK);
        }
        System.out.println("AutoClicker completed.");
    }
}
