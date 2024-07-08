package mid2.collection.set;

public class StringHashMain {
    static final int CAPACITY = 10;
    public static void main(String[] args) {

        // char
        char charA = 'A';
        char charB = 'B';
        char charZ = 'Z';

        System.out.println("charA: "+ (int) charA);
        System.out.println("charB: "+ (int) charB);
        System.out.println("charZ: "+ (int) charZ);

        // hashCode
        System.out.println("getHashCode(\"APPLE\"): " + getHashCode("APPLE"));
        System.out.println("getHashCode(\"SUGAR\"): " + getHashCode("SUGAR"));
        System.out.println("getHashCode(\"ACID\"): " + getHashCode("ACID"));

        // hashIndex
        System.out.println("getHashIndex(\"APPLE\"): " + getHashIndex("APPLE"));
        System.out.println("getHashIndex(\"SUGAR\"): " + getHashIndex("SUGAR"));
        System.out.println("getHashIndex(\"ACID\"): " + getHashIndex("ACID"));

        System.out.println("getHashCode(\"I\"): " + getHashIndex("I"));
    }

    static int getHashCode(String str){
        char[] charArray = str.toCharArray();
        int sum = 0;
        for (char c : charArray) {
            sum += c;
        }
        return sum;
    }

    static int getHashIndex(String str){
       return getHashCode(str) % CAPACITY;
    }
}
