package designpattern.example.Flyweight;

@FunctionalInterface
public interface Order {
    void serve();

    static Order of(String flavourName, int tableNumber) {
        var flavour = CoffeeFlavour.intern(flavourName);
        return () -> System.out.println("Serving " + flavour + " to table " + tableNumber);
    }
}
