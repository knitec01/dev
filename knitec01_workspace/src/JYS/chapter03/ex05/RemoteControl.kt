package JYS.chapter03.ex05

public interface RemoteControl {
    int MAX_VOLUME = 20;
    int MIN_VOLUME = 0;
//
    void turnOn();
    void turnOff();
    void setVolumn(int volume);

    default void setMute(boolean mute){
        if(mute){
            System.out.println("무음 처리");
            System.out.println("MIN_VOLUME");
            System.out.println("MIN_VOLUME2");

        }
        else{
            System.out.println("무음 해제합니다.);
        }
    }


}