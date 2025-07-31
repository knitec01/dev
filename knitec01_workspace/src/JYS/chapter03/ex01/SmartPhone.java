package JYS.chapter03.ex01;

public class SmartPhone extends Phone{
    public SmartPhone(String owner)
    {
        //int a = 10
        // super는 맨 첫줄에
        super(owner);

    }

    void internetSearch(){
        System.out.println("인터넷 검색을 합니다.");
    }
}
