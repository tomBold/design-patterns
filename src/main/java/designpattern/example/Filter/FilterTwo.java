package designpattern.example.Filter;

public class FilterTwo implements Filter {
    @Override
    public void execute(String request) {
        System.out.println("FilterTwo : " + request);
    }
}
