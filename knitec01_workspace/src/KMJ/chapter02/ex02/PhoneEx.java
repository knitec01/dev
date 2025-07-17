package KMJ.chapter02.ex02;

public class PhoneEx {
    public static void main(String[] args) {
        // new
        // 1. 0x100번지에 Phone객체를 생성
        // 2. Phone객체가 저장된 0x100이라는 주소값을 반환
        // Phone()
        // 매개변수가 없는 생성자 호출(생성자가 없지만 호출되는 이유는? -> Phone클래스 참고)
        Phone phone1 = new Phone();
        System.out.println("phone1 변수가 phone 객체를 참조합니다.");

        //
        Phone phone2 = new Phone();
        System.out.println("phone2 변수가 또 다른 phone 객체를 참조합니다. ");

        // phone1과 phone2는 참조변수로 객체 자체가 아닌 객체가 저장된 주소를 저장.
        // '=='연산자로 저장된 값을 비교하면 객체가 저장된 주소를 비교.
        // false
        System.out.println(phone1 == phone2);
    }
}
