package designpattern.example.AbstractFactory;

public class ColorFactory implements AbstractFactory {
    @Override
    public Color create(String type) {
        if ("Pink".equalsIgnoreCase(type)) {
            return new Pink();
        }
        return null;
    }
}
