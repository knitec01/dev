package JYS.chapter03.ex05;

import JYS.chapter03.ex03.RemoteControl;
import JYS.chapter03.ex03.Television;

public class RemoteControlExample {
    public static void main(String[] args) {
        RemoteControl rc;
        rc  = new Television();
        rc.turnOn();

        rc  = new Audio();
        rc.turnOn();
    }
}
