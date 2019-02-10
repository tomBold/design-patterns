package designpattern.example.Strategy;

@FunctionalInterface
public interface BillingStrategy {

    int getActPrice(int rawPrice);

    static BillingStrategy normalStrategy() {
        return rawPrice -> rawPrice;
    }

    static BillingStrategy happeyStrategy(){
        return rawPrice -> rawPrice / 2;
    }
}
