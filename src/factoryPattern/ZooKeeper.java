package factoryPattern;

public class ZooKeeper {
    public static void main(String[] args) {
            Food food1 = FoodFactory.getFood("polar bear");
            food1.consumed();

            Food food2 = FoodFactory.getFood("zebra");
            food2.consumed();

            Food food3 = FoodFactory.getFood("Tiger");
            food3.consumed();
    }
}
