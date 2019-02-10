package designpattern.example.Builder;

public class BankAccount {
    private String name;
    private String accountNumber;
    private String email;
    private boolean newsletter;

    private BankAccount(BankAccountBuilder builder){
        this.name = builder.name;
        this.accountNumber = builder.accountNumber;
        this.email = builder.email;
        this.newsletter = builder.newsletter;
    }

    public String getName() {
        return name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getEmail() {
        return email;
    }

    public boolean isNewsletter() {
        return newsletter;
    }

    public static class BankAccountBuilder {
        private String name;
        private String accountNumber;
        private String email;
        private boolean newsletter;

        public BankAccountBuilder(String name, String accountNumber) {
            this.name = name;
            this.accountNumber = accountNumber;
        }

        public BankAccountBuilder withEmail(String email) {
            this.email = email;
            return this;
        }

        public BankAccountBuilder wantNewsletter(boolean newsletter) {
            this.newsletter = newsletter;
            return this;
        }

        public BankAccount build() {
            return new BankAccount(this);
        }
    }
}
