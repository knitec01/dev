package JYS.chapter02;

public class StudentEx {
    public static void main(String[] args) {
        Student student1 = new Student();
        System.out.println("s1 변수가 student 객체를 참조합니다.");

        Student student2 = new Student();
        System.out.println("student2 변수가 또 다른 Student 객체플 참조합니다.");

        System.out.println(student1 == student2);
    }
}
