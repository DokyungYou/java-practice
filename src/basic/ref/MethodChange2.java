package basic.ref;


class Data{
    int value;

    public Data(int value) {
        this.value = value;
    }
}


public class MethodChange2 {


    static int changeRef(Data data){
        
        // 인수로 넘겼던 변수의 참조값을 복사해서 매개변수에 대입하기때문에
        // 인수로 넘겼던 데이터의 value 가 20으로 변경
        return data.value = 20;
    }
    
    public static void main(String[] args) {

        Data data = new Data(100);

        System.out.println(changeRef(data));
        System.out.println("data.value: " + data.value);
    }
}
