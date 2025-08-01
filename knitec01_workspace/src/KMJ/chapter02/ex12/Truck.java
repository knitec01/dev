package KMJ.chapter02.ex12;

public class Truck {

    // 필드 선언
    private int oil;
    private boolean isRepair;

    // 값 읽기
    // getXXX()이라는 이름 규칙 사용.(리턴 타입이 boolean인 경우 isXXX()사용)
    public int getOil(){
        return oil;
    }

    // 값 설정
    // 복잡한 로직으로 유효한 값 검사 가능.
    // setXXX()이라는 이름 규칙 사용.
    public void setOil(int oil){
        if(oil < 0){
            this.oil = 0;
        }
        else {
            this.oil = oil;
        }
    }

    public boolean isRepair(){
        return isRepair;
    }

    public void setRepair(boolean repair){
        this.isRepair = repair;
        // 실행문이 1개인 경우 괄호 생략가능.
        if(repair == true) this.oil = 0;
    }
}
