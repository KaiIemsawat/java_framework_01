public class ShoppingBalanceLazy {
    private double balance;
    private static ShoppingBalanceLazy instance;

    private ShoppingBalanceLazy(double balance) {
        this.balance = balance;
    }

    public static ShoppingBalanceLazy getInstance(double balance) {
        if (instance == null) {
            instance = new ShoppingBalanceLazy(balance);
            return instance;
        }
        return instance;
    }

    public static ShoppingBalanceLazy getInstance() {
        if (instance == null) {
            instance = new ShoppingBalanceLazy(1000.00);
            return instance;
        }
        return instance;
    }

    public void buy(String item, double price) {
        balance = balance - price;
        System.out.println("Bought : " + item);
        System.out.println("Price : " + price);
        System.out.println("Remaining balance : " + balance);
    }
}
