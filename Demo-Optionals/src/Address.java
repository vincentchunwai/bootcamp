import java.util.Optional;

class Address {
    private String city;

    public Address(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }
}

class Person {
    private String name;
    private Optional<Address> address;

    public Person(String name, Address address) {
        this.name = name;
        this.address = Optional.ofNullable(address);
    }

    public String getName() {
        return name;
    }

    public Optional<Address> getAddress() {
        return address;
    }
}

