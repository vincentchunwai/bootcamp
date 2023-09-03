import java.util.Optional;

public class Phone {
    Optional<PhoneColor> phoneColor;
    Optional<String> phoneNum;
    Optional<Integer> price;

    private Phone(PhoneBuilder builder) {
        this.phoneColor = builder.phoneColor;
        this.phoneNum = builder.phoneNum;
        this.price = builder.price;
    }

    public static PhoneBuilder builder() {
        return new PhoneBuilder();
    }

    @Override
    public String toString() {
        return "[Phone Color: " + phoneColor.map(Object::toString).orElse("N/A") //
            + " , Phone Number: " + phoneNum.orElse("N/A") //
            + " , Price: " + price.map(Object::toString).orElse("N/A") //
            + "]";
    }

    static class PhoneBuilder {
        Optional<PhoneColor> phoneColor = Optional.empty();
        Optional<String> phoneNum = Optional.empty();
        Optional<Integer> price = Optional.empty();

        PhoneBuilder phoneColor(PhoneColor phoneColor) {
            this.phoneColor = Optional.ofNullable(phoneColor);
            return this;
        }

        PhoneBuilder phoneNum(String phoneNum) {
            this.phoneNum = Optional.ofNullable(phoneNum);
            return this;
        }

        PhoneBuilder price(int price) {
            this.price = Optional.of(price);
            return this;
        }

        Phone build() {
            return new Phone(this);
        }
    }

    public static void main(String[] args) {
        Phone newPhone = Phone.builder()
                .phoneNum(null)
                .phoneColor(null)
                .price(12000)
                .build();

        System.out.println(newPhone);
    }
}

