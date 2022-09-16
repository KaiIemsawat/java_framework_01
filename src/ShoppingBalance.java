public class ShoppingBalance {
    /*
    A private constructor in Java is used in restricting object creation.
    It is a special instance constructor used in static member-only classes.
    If a constructor is declared as private,
    then its objects are only accessible from within the declared class.
    You cannot access its objects from outside the constructor class.

    ---------------------------------------------------------
    Single Design Pattern
    When we wat to have only one instance of the particular class in the memory
    any given time.

    ---------------------------------------------------------
    All constructors in the class should be 'private
    Create static final instance of the class itself and initialize
    Provide static public getInstance() method to get final instance
    */
    public double balance;
    private static final ShoppingBalance instance;

    private ShoppingBalance(double balance) {
        this.balance = balance;
    }

    static {
        instance = new ShoppingBalance(2000.00);
    }

    public static ShoppingBalance getInstance() {
        return instance;
    }

    // make constructor "private"


    public void buy(String item, double price) {
        balance = balance - price;
        System.out.println("Bought : " + item);
        System.out.println("Price : " + price);
        System.out.println("Remaining balance : " + balance);
    }
}
