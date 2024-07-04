package mid2.generic.test.example03;

public class ClassUnit {
    private String name;
    private int hp;
    private int mp;

    public ClassUnit(String name, int hp, int mp) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getMp() {
        return mp;
    }

    @Override
    public String toString() {
        return "ClassUnit{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", mp=" + mp +
                '}';
    }
}
