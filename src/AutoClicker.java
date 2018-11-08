import java.awt.*;

class AutoClicker {
    private Robot robot;
    private int delay;

    AutoClicker() {
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
        delay = 100;
    }

    void clickMouse(int button) {
        try {
            robot.mousePress(button);
            robot.delay(1);
            robot.mouseRelease(button);
            robot.delay(delay);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void setDelay(int ms) {
        this.delay = ms;
    }
}
