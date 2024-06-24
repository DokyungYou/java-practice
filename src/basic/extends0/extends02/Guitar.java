package basic.extends0.extends02;

public class Guitar {

    private boolean isTuned;
    public void play(){

        if(isTuned == false) System.out.println("튜닝 전 상태");
        System.out.println("기타를 연주합니다.");
    }


    public void tune() {
        isTuned = true;
        System.out.println("튜닝 완료");
    }

    public void changeStrings(){
        System.out.println("줄 교체 완료");
    }

}
