package JYS.chapter02.ex21;

import JYS.chapter02.ex13.SmartPhoneEx;

public class PhoneEx {
    public static void main(String[] args) {
        //Phone phone = new Phone();

        SmartPhone  smartPhone = new SmartPhone("홍길동");

        smartPhone.turnOn();
        smartPhone.internetSearch();
        smartPhone.turnOff();

    }
}
