public class Customer {
    private String name;
    private Account account;

    public Customer(String name, String accountNumber) {
        this.name = name;
        this.account = new Account(accountNumber);
    }

    public String getName() {
        return name;
    }

    public Account getAccount() {
        return account;
    }
}