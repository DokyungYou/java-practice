package basic.memory;

// 실행 순서대로 따라가면서 읽기
public class JavaMemoryMain2 {
    public static void main(String[] args) { // main method 스택프레임 생성
        System.out.println("== main 시작 ==");
        method1(); // method1 스택프레임 생성
        // method1 스택 프레임 제거 + data1 날라감 => heap 에 생성됐던 인스턴스를 참조하는 변수가 스택에 전혀 남아있지 않음 => GC가 method1의 로직에서 생성했던 객체를 찾아서 제거
        
        
        System.out.println("== main 끝 ==");
    } // main method 스택프레임 제거 (프로그램 끝)
    // 참고: heap 영역 안에서만 참조 중인 객체도 GC의 제거대상 (stack 에서 참조하지 않으면 결국 사용하고 있지 않다는거니까)
    

    static void method1() {
        System.out.println("method1 시작");
        Data data1 = new Data(1);  // heap 메모리에 인스턴스 생성 동시에 data1에 참조값 할당 (data1은 method1의 스택프레임 내에 포함됨)
        
        method2(data1);  // method2 스택프레임 생성
        // method2 스택 프레임 제거 + data2 날라감

        System.out.println("method1 끝");
    } 

   static void method2(Data data2) {  // method2 스택프레임 안에 data2 지역변수 포함됨
       System.out.println("method2 시작");
       System.out.println("data2.getValue():" + data2.getValue());
       System.out.println("method2 끝");
    }
}

