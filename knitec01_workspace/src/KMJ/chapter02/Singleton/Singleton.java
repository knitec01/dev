package KMJ.chapter02.Singleton;

public class Singleton {
    // 1. private로 해당 필드에 직접적인 접근을 막음.
    // 2. 정적 멤버로 선언하여 같은 Singleton타입이라면 공유하게 만듦.
    // 3. Singleton 객체를 생성해서 초기화
    private static Singleton singleton = new Singleton();

    // 접근지정자를 private로 선언하여 외부에서의 생성자 호출 즉, 객체 생성을 제한
    // 생성자를 호출할 수 없으므로 객체 생성 자체가 불가능하게 됨.
    private Singleton(){

    }

    // 매번 객체를 생성하지 않고 미리 만들어진 객체를 반환하기만 함.
    public static Singleton getInstance(){
        return singleton;
    }

    // 결론, 직접적인 객체 생성을 막고 이미 만들어진 인스턴스를 재 사용하기만 함.
    // 이를 통해 Singleton은 항상 같은 객체 임을 보장받을 수 있음.

}
