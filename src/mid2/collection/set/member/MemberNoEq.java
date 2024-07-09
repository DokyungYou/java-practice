package mid2.collection.set.member;

import java.util.Objects;

public class MemberNoEq {
    private String id;

    public MemberNoEq(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "MemberNoEq{" +
                "id='" + id + '\'' +
                '}';
    }
}