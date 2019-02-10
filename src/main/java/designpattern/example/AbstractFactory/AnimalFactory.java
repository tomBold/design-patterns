package designpattern.example.AbstractFactory;

public class AnimalFactory implements AbstractFactory {
    @Override
    public Animal create(String type) {
        if ("Dog".equalsIgnoreCase(type)) {
            return new Dog();
        } else if ("Duck".equalsIgnoreCase(type)) {
            return new Duck();
        }

        return null;
    }
}
