package mid1.lang.immutable.address.example;

import mid1.lang.immutable.address.ImmutableAddress;

public class Member02 {
    private String name;
    private ImmutableAddress address;

    public Member02(String name, ImmutableAddress address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ImmutableAddress getAddress() {
        return address;
    }

    public void setAddress(ImmutableAddress address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
