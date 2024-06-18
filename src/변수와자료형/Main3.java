package 변수와자료형;
// Java 프로그래밍 - 변수와 자료형_3
// 특히 문자열 메서드 등은 능숙해져야함
// 나중에 따로 더 자세하게 짚어보기

public class Main3 {
  public static void main(String[] args) {

//  1. 자료형 - 문자열 (문자들로 이루어진 집합)
    System.out.println("== 문자열 ==");
    String s1 = "Hello World!";
    String s2 = "01234";

    System.out.println("s1: " + s1);
    System.out.println("s2: " + s2);

    System.out.println("[equals & ==] ====================");
//  1-1. equals
    String s3 = "hi";
    String s4 = "hi";



    // 문자 리터럴 비교
    System.out.println("s3.equals(s4): "+s3.equals(s4));  // true
    System.out.println("==로 비교: " + (s3 == s4));  // true   같은 모양의 문자열은 stack 메모리의 같은 곳을 바라봄


    // 문자 객체 비교
    String s5 = new String("hi");  //  new 는 heap 메모리에 들어간다.
    System.out.println(s3.equals(s5)); // true
    System.out.println(s3 == s5); // false



    System.out.println("indexOf ==============");
//  1-2. indexOf
    String s6 = "Hello! World!";
    System.out.println("indexOf !:" + s6.indexOf("!"));  // 5
    System.out.println(s6.indexOf("!", s6.indexOf("!") + 1));  // 12  (5번 인덱스이후부터 찾는다.)
    System.out.println(s6.indexOf("rl"));  // 9


    System.out.println("lastIndexOf ==========="); // 마지막으로 나타나는 문자열의 인덱스 반환
    System.out.println(s6.lastIndexOf("o"));  // 8
    System.out.println(s6.lastIndexOf("lo"));  // 3


    s6 = "<Git> & <Github>";
    System.out.println(s6.lastIndexOf("it",5 ));  //  5번인덱스 안에서 it를 찾되, 역방향으로 검색
    System.out.println(s6.lastIndexOf("ub", 1));  // -1 (없음)


    System.out.println("replace ==============");
//  1-3. replace
    String s7 = s6.replace("Hello", "Bye");
    System.out.println("s7: " + s7);  // s6에 Hello", "Bye" 자체가 없어서 변화없음 (에러는 뜨지 않음)

    s7 = s6.replace("Git","Github");
    System.out.println("replace s7: " + s7);   // <Github> & <Githubhub>


    System.out.println("subString =============");
//  1-4. substring

    // s7: <Github> & <Githubhub>
    System.out.println(s7.substring(0, 3));  //  <Gi   (0~2까지의 문자열 자르기)
    System.out.println(s7.substring(0, s7.indexOf("!") + 1));

    System.out.println(s7 = s7.substring(0,s7.lastIndexOf("hub"))+">");

//  1-5. toUpperCase & toLowerCase
    System.out.println(s7.toUpperCase());
    System.out.println(s7.toLowerCase());


//  2. 자료형 - StringBuffer  (StringBuilder 도 있음)
    System.out.println("== StringBuffer ==");
    StringBuffer sb1 = new StringBuffer();
    sb1.append("01234");
    System.out.println("sb1: " + sb1);  // 01234
    sb1.append("56789");
    System.out.println("sb1: " + sb1); //0123456789

    String a = "01234";
    String b = "56789";
    String bak = a;
    System.out.println(a == bak);  // true
    a += b;
    System.out.println(a == bak); // false


    System.out.println("StringBuffer insert ==============");
    StringBuffer sb2 = new StringBuffer("name is");
    sb2.insert(0, "My "); // 0번인덱스에  "My "를 집어넣는다.
    sb2.insert(sb2.length(), " JAVA");
    System.out.println("sb2: " + sb2);
    System.out.println(sb2.substring(0, 2));

    sb2.insert(sb2.length()-1, "ASCRIPT"); // My name is JAV"ASCRIPT"A   사이에 낑겨넣는 것이다.
    System.out.println(sb2);


//      3. 자료형 - 배열
    System.out.println("== 배열 ==");
    int[] myArray1 = {1, 2, 3, 4, 5};
    System.out.println(myArray1[0]); // 1
    System.out.println(myArray1[1]); // 2
    System.out.println(myArray1[2]); // 3
    System.out.println(myArray1[3]); // 4
    System.out.println(myArray1[4]); // 5

    char[] myArray2 = {'a', 'b', 'c', 'd', 'e'};
    System.out.println(myArray2[2]);  // c

    String[] myArray3 = new String[3];
    myArray3[0] = "Hello";
    myArray3[1] = " ";
    myArray3[2] = "World!";
    System.out.println(myArray3[0] + myArray3[1] + myArray3[2]);



    // 참고 ======================
    // 방법1
    int[] intArr1 = new int[]{1,2,3};

    // 방법 2
    int[] intArr2 = new int[3];
    intArr2 = new int[]{1, 2, 3};


    // 방법 3 (배열 이니셜라이저는 미리 정의된 값으로 선언할 때 초기화해야함)
    int[] intArr3 = {1,2,3};
  }
}
