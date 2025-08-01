package KMJ.chapter02.ex12;

public class TruckEx {
    public static void main(String[] args) {
        Truck myTruck = new Truck();

        // 잘못된 기름 양으로 변경시도
        // oil필드를 -50으로 설정
        myTruck.setOil(-100);
        System.out.println("현재 기름양: " + myTruck.getOil());

        // 올바른 기름 양 변경
        myTruck.setOil(60);
        System.out.println("현재 기름양: " + myTruck.getOil());

        if(!myTruck.isRepair()){
            myTruck.setRepair(true);
        }
        System.out.println("현재 기름양: " + myTruck.getOil());
    }
}
