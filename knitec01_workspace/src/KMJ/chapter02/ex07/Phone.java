package KMJ.chapter02.ex07;

public class Phone {
    // 인스턴스 멤버 선언
    int displaySize;

    // 인스턴스 메소드 선언
    void showInfo(){
        System.out.println("화면 크기는" + displaySize + "인치 입니다.");
    }

    static void simulate(){
        // 객체 생성
        Phone myPhone = new Phone();
        // 인스턴스 멤버 사용
        myPhone.displaySize = 16;
        myPhone.showInfo();
    }

    public static void main(String[] args) {
        // non-static 멤버 객체 사용 전 사용 불가.
        // displaySize = 16;
        // showInfo();

        // 정적 메소드 호출
        simulate();

        // 객체 생성
        Phone myPhone = new Phone();
        // 인스턴스 멤버 사용
        myPhone.displaySize = 16;
        myPhone.showInfo();
    }
}
