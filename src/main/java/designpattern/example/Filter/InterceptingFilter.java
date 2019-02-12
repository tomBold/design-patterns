package designpattern.example.Filter;

public class InterceptingFilter {
    public static void main(String[] args)
    {
        FilterManager filterManager = new FilterManager(new Target());
        filterManager.setFilter(new FilterOne());
        filterManager.setFilter(new FilterTwo());

        Client client = new Client();
        client.setFilterManager(filterManager);
        client.sendRequest("Downloads");

    }
}
