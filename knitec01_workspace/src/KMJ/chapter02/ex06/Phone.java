package KMJ.chapter02.ex06;

public class Phone {
    static String company = "SEMSUNG";
    static String model = "LCD";
    static String info;

    // 정적 초기화 블럭
    static{
        info = company + "-" + model;
    }

}
