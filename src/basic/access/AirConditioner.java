package basic.access;

// 온도 최대 32  최소16
public class AirConditioner {


//    int temperature;
    private int temperature;

    public AirConditioner(){
        this.temperature = 22;
    }


    void showTemperature(){
        System.out.println("현재 온도: " + temperature +"도");
    };



    void upTemperature(){

        if(temperature >= 32){
            System.out.println("최대 설정온도는 32도입니다.");
            return;
        }

        System.out.println("온도를 1도 올립니다.");
        this.temperature++;
    };

    void downTemperature(){

        if(temperature <= 16){
            System.out.println("최소 설정온도는 16도입니다.");
            return;
        }

        System.out.println("온도를 1도 내립니다.");
        this.temperature--;
    };


}
