package CHY.chapter01.ex09;

public class ArrayCreateByValue {
    public static void main(String[] args) {
        // 배열의 크기(길이는) 4
        String [] fruits = {"banana", "apple", "orange"};

        // 배열의 첨자로 개별 요소의 값 읽기.
        // System.out.println("fruit[0] : " + fruit[0]);

        // 0, 1, 2 0-based
        // {"banana", "kiwi", "apple"};
        // fruits[1] = "kiwi";
        // System.out.println("fruits[1] : " + fruits[1]);

        int i;
        // fruits.length: 배열의 길이(개수)를 의미. 3
        // 배열의 전체 요소를 순회하는 경우 아래의 for문에서 사용된 초기식, 조건식, 증감식을 주로 사용.
        for(i = 0; i < fruits.length; i++){
            System.out.println("fruits[" + i + "] :" + fruits[i]);
        }

        int j = 0;
        // forEach(향상된 for문)
        // 배열의 요소를 [0] ~ [fruits.length - 1]까지 순차적으로 순회
        for(String fruit : fruits){
            System.out.println("season의 개별요소: " + fruit);
            j++;
            if(j == 3){
                System.out.println("j=3");
                // 이번 회차의 반복을 중단하고 다음 회차의 반복 수행.
                continue;
            }
            if(j == 4){
                System.out.println("j=4");
                // 실행중인 반복문을 종료
                break;
            }
        }
    }
}
