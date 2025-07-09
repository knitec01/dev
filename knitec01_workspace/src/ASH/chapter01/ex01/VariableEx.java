package ASH.chapter01.ex01;


// 기본 타입
// 1. 정수형
// - byte, short, char, int(정수 리터럴 기본 타입), long
// 2. 실수형
// - float, double(실수 리터럴 기본 타입)
// 3. 논리형
// - boolean

public class VariableEx {
    public static void main(String[] args) {
        // 1. 변수의 선언
        // 2. camel style로 작성
        int var1;
        
        // 초기화되지 않는 변수 사용시 컴파일 오류
        // int result = var1 + 10;

        // 변수 var를 초기화
        var1 = 10;

        // 변수 result를 var1의 값과 20을 더한 값으로 초기화 
        int result = var1 + 20;
        
        // console에 result값을 출력
        System.out.print(result);

    }
}
