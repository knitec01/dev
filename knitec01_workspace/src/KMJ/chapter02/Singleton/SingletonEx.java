package KMJ.chapter02.Singleton;

public class SingletonEx {
    public static void main(String[] args) {
        // 생성자가 private로 선언되어 있으므로 직접적인 객체 생성이 불가능.
//        Singleton obj1 = new Singleton();
//        Singleton obj2 = new Singleton();

        // 이미 생성된 인스턴스를 가져와서 사용하기만 함.
        // 이를 통해 동등성을 항상 보장 받을 수 있음.ㄴ
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        // 싱글턴 객체의 경우 객체의 동등성이 보장 됨.
        // true
        System.out.println(s1 == s2);
    }
}
