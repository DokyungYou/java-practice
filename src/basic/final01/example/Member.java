package basic.final01.example;

public class Member {

    private final String id;
    private String name;

    public Member(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void changeMemberInfo(String name){
        // this.id = id;
        this.name = name;
    }

    public void printMemberInfo(){
        System.out.println("id: " + id+ ", name: "+ name);
    }
}
