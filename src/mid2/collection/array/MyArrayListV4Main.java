package mid2.collection.array;

public class MyArrayListV4Main {
    public static void main(String[] args) {
        MyArrayListV4<String> strList = new MyArrayListV4<>();
        strList.add("*");
        strList.add("a");
        strList.add("p");
        strList.add("p");
        strList.add("l");
        strList.add("e");
        strList.add("*");
        //strList.add(1);
        System.out.println(strList);

        MyArrayListV4<Integer> integerList = new MyArrayListV4<>();
        integerList.add(1);
        integerList.add(1);
        integerList.add(1);
        integerList.add(1);
        integerList.add(1);
        integerList.add(1);
        System.out.println(integerList);
    }
}
