import java.util.Optional;

class Personn {
    private String name;
    private Optional<Address> address;

    public Personn(String name, Address address) {
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
