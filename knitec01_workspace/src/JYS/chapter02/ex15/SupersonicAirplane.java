package JYS.chapter02.ex15;

public class SupersonicAirplane extends  Airplane{
    public static final  int NORMAL = 1;
    public static final  int SUPERSONIC = 2;

    //상태 필드 선언
    public int flyMode = NORMAL;

    @Override
    public void fly(){
        if(flyMode ==  SUPERSONIC)
        {
            System.out.println("초음속비행");
        }
        else {
            super.fly();
        }
    }

}
