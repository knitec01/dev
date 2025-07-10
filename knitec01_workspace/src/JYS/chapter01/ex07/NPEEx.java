package JYS.chapter01.ex07;

/*
* 데이터
* 1. 기본 타입
*    1) 정수
*       byte, short, char, int, long
*    2) 실수
*       float, double
*    3) 논리
*       boolean
* 2. 참조 타입
*    1) 배열 타입
*    2) 열거 타입
*    3) 클래스
*    4) 인터페이스
*/

public class NPEEx {
    public static void main(String[] args) {
//        // 배열 변수 arr1 선언
//        int[] arr1;
//        int[] arr2;
//        int[] arr3;
//
//        // 배열 {1, 2, 3}을 생성하고 arr1 변수에 생성한 배열의 '주소 값'을 대입
//        arr1 = new int[] {1, 2, 3};
//        // 배열 {1, 2, 3}을 생성하고 arr2 변수에 생성한 배열의 '주소 값'을 대입
//        // 배열의 주소값을 담고 있음.
//        arr2 = new int[] {1, 2, 3};
//
//        // arr3라는 변수에 arr2의 값(생성한 배열의 주소 값)이 담기게 됩니다.
//        // (arr2의 값이 주소값이므로 arr3도 arr2의 주소값을 가지게 됨.)
//        arr3 = arr2;
//
//        // 주소값이 같은지를 비교하게 됨.
//        // ( ==는 변수의 값을 비교. arr1, arr2는 배열의 주소를 담고 있으므로 배열의 주소를 비교)
//        System.out.println(arr1 == arr2);
//
//        // true
//        System.out.println(arr2 == arr3);


        int[] intArr = null;
        // NPE(Null Pointer Exception)
        // intArr[0] = 10;

        String str = null;
        // NPE(Null Pointer Exception)
        System.out.println("총 문자 수: " + str.length());
    }
}
