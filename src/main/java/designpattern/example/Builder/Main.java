package designpattern.example.Builder;

public class Main {
    public static void main(String[] args) {
        BankAccount newAccount = new BankAccount
                .BankAccountBuilder("Jon", "22738022275")
                .withEmail("jon@example.com")
                .wantNewsletter(true)
                .build();

        System.out.println(newAccount);
    }
}
