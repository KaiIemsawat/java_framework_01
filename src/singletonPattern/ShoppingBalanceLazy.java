package singletonPattern;

public class ShoppingBalanceLazy {
    /*
    •Another technique is to delay creation of the singleton until the
    first time the getInstance() method is called.
    •It used often together with the singleton pattern.
    •For example, you may have seen lazy instantiation in app you
    use everyday. Eclipse, often demonstrates a slight delay the first
    time you open a Java file in an editor window after starting the
    program. This delay disappears, though, when you open
    additional Java files. This is an example of lazy instantiation,
    since Eclipse is only loading the libraries to parse and present
    Java files the first time a Java file is open.
    */

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
        System.out.println("Remaining balance --> " + balance);
    }
}
