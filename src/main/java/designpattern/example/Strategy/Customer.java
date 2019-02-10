package designpattern.example.Strategy;

import java.util.ArrayList;

public class Customer {

    private final ArrayList<Integer> drinks = new ArrayList<>();
    private BillingStrategy strategy;

    public Customer(BillingStrategy strategy) {
        this.strategy = strategy;
    }

    public void add(int price, int quantity) {
        drinks.add(strategy.getActPrice(price * quantity));
    }

    // Payment of bill
    public void printBill() {
        int sum = drinks.stream().mapToInt(v -> v).sum();
        System.out.println("Total due: " + sum / 100.0);
        drinks.clear();
    }

    // Set Strategy
    public void setStrategy(BillingStrategy strategy) {
        this.strategy = strategy;
    }
}
