package JYS.chapter01.ex09;

public class ArrayCreateByValue {
    public static void main(String[] args) {
        //
        String [] season = {"Spring","Summer","Fall","Winter"};

        // 배열의 항목값 읽기
        System.out.println("season[0]:" + season[0]);

        // 0,1,2,3 0-based
        //{"Spring","Summer","Fall","Winter"};
        season[1] = "여름";
        System.out.println("season[1]:" + season[1]);
        System.out.println("문자열" + 10);

        int i = 0;
        //season.length:배열의 길이(개수)를 의미(4)
//        for(i=0;i < season.length; i++){
//            System.out.println("season[" + i + "]:" + season[i]);
//        }

        int j=0;
        //forEach(향상된 for문)
        for(String sea : season){
            // 인덱스 순번은 사용불가
            System.out.println("season의 개별요소: " + sea);
            j++;
            if(j == 3){
                System.out.println("j=3");
                 continue;
            }
            if(j == 4){
                System.out.println("j=4");
                break;
            }
        }
    }
}
