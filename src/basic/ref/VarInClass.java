package basic.ref;

  class Ref{
    int num;

      public Ref(int num) {
          this.num = num;
      }
  }


public class VarInClass {
    public static void main(String[] args) {

        Ref ref1 = new Ref(1);
        Ref ref2 = ref1;

        if (ref1 == ref2) {
            // stack 메모리 값 비교 (변수에 참조값 들어있음)
            System.out.println("참조값: " + ref1);
        }
        if (ref1.equals(ref2)) {
            // 주소값 비교 (Object의 equals)
            System.out.println("두 개는 같은 객체를 참조 중이다.");
        }

            System.out.println("ref1.num:  " + ref1.num);
            System.out.println("ref2.num:  " + ref2.num);

            ref1.num = 0;

            System.out.println("\n== ref1.num = 0 으로 변경  ==");
            System.out.println("ref1.num:  " + ref1.num);
            System.out.println("ref2.num:  " + ref2.num);

            ref2.num = 10;

            System.out.println("\n== ref2.num = 10 으로 변경 ==");
            System.out.println("ref1.num:  " + ref1.num);
            System.out.println("ref2.num:  " + ref2.num);
        }

    }
