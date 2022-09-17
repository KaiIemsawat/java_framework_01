package singletonPattern;

public class ShoppingBalanceDemo {
    public static void main(String[] args) {
//        ShoppingBalance obj1 = new ShoppingBalance(); // <-- can't be created
        ShoppingBalance balance01 = ShoppingBalance.getInstance();
        balance01.buy("item:1", 300.00);

        System.out.println("------");

        ShoppingBalance balance02 = ShoppingBalance.getInstance();
        balance02.buy("item:2", 800.00);
//        balance01.buy("item:2", 800.00); // <--- this will give the same result as above since they are actually the same object

        System.out.println("-----------------------------------");

        // =======================================================================
//        ShoppingBalanceLazy lzBalance01 = ShoppingBalanceLazy.getInstance();
//        lzBalance01.buy("Apple", 3.99);
//        lzBalance01.buy("Orange", 2.99);
//
//        System.out.println("------");
//
//        ShoppingBalanceLazy lzBalance02 = ShoppingBalanceLazy.getInstance();
//        lzBalance02.buy("Kiwi", 4.29);
//        lzBalance02.buy("Banana", 0.99);

        // =======================================================================
//        Or we can set the number in main method
//        But if we have used the above method before,
//        the number will still refer to the above since they are the same object
        ShoppingBalanceLazy bl = ShoppingBalanceLazy.getInstance(5000.00);
        bl.buy("Book", 200.00);
        bl.buy("monitor", 400.50);
        bl.buy("Keyboard", 99.99);
    }
}
