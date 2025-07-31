package JYS.chapter01.ex07;

/*
* 데이터
* 1. 기본 타입
* 1) 정수
* byte, short char, *int, long
* 2) 실수
* float, *double,
* 3) 논리
* boolean
* 2. 참조 타입
* 1) 배열 타입
* 2) 열거 타입
* 3) 클래스
* 4) 인터페이스
*/

public class NPEEx {
    public static void main(String[] args) {
        // 배열 변수
        int[] arr1;
        int[] arr2;
        int[] arr3;

        //배열 {1,2,3}을 생성하고 arr1 변수에 대입
        arr1 = new int[]{1,2,3};
        //배열 {1,2,3}을 생성하고 arr2 변수에 대입
        arr2 = new int[]{1,2,3};
        //arr3 라는 변수에 arr2의 값이; 담기게 됩니다.
        //arr2의 값이 주소값이므로 arr3도 arr2의 주소값이 담긴다.
        arr3 = arr2;

        //주소가 같은지를 비교하는 조건문
        //false
        //System.out.println(arr1 == arr2);
        //true
        //System.out.println(arr2 == arr3);

        int[] intArr = null;
        //NPE(Null Pointer Exception)
        intArr[0] = 10;

        //스트링은 클래스이므로 대뭍ㄴ자.
        String str = null;

        //NPE
        System.out.println("총 문자 수 : " + str.length());


    }
}
