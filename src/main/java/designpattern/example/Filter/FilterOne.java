package designpattern.example.Filter;

public class FilterOne implements Filter {
    @Override
    public void execute(String request) {
        System.out.println("FilterOne : " + request);
    }
}
