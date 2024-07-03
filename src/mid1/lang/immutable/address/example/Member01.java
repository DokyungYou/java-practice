package mid1.lang.immutable.address.example;

import mid1.lang.immutable.address.Address;

public class Member01 {
    private String name;
    private Address address;

    public Member01(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
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
