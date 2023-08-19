import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Optionalexample {
    public static void main(String[] args){
        Address address = new Address("New York");
        Address address2 = new Address("Ohio");
        Personn p1 = new Personn("John Doe", address);
        Personn p2 = new Personn("John Doe", address2);
        Personn p3 = new Personn("John Doe", null);
        List<Personn> persons = new ArrayList<>();
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);


        List<String> cities = persons.stream()
        .map(person -> person.getAddress()
                            .map(Address::getCity)
                            .orElse("Unknown City"))
        .collect(Collectors.toList());

        System.out.println("City: " + cities);

        
    }
}

