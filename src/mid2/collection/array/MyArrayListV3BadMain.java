package mid2.collection.array;

public class MyArrayListV3BadMain {
    public static void main(String[] args) {
        MyArrayListV3 numberlist = new MyArrayListV3();

        // 숫자만 입력 하기를 기대했으나
        numberlist.add(1);
        numberlist.add(2);
        numberlist.add("3");
        numberlist.add("숫자 4");
        System.out.println(numberlist);
        Integer first = (Integer)numberlist.get(0);
        Integer second = (Integer)numberlist.get(1);
        Integer third = (Integer)numberlist.get(3);
        //Integer fourth = (Integer)numberlist.get(4); //ClassCastException
    }
}
