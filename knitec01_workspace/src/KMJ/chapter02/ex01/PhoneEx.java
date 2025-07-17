package KMJ.chapter02.ex01;

public class PhoneEx {
    public static void main(String[] args) {
        // Phone 객체 생성, 매개변수가 3개인 생성자를 호출
        Phone phone1 = new Phone("갤럭시", "red", 16);

        // 매개변수가 2개인 생성자를 호출
        Phone phone2 = new Phone("아이폰", "blue");

        // new Phone();

        System.out.println("모델명: " + phone1.model);
        System.out.println("색: " + phone1.color);
        System.out.println("디스플레이 사이즈: " + phone1.displaySize);

        System.out.println();

        System.out.println("모델명: " + phone2.model);
        System.out.println("색: " + phone2.color);
        System.out.println("디스플레이 사이즈: " + phone2.displaySize);
    }
}
