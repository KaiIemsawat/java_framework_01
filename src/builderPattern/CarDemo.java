package builderPattern;

public class CarDemo {
    public static void main(String[] args) {
        Car car = new Car("BMW",
                            "325i",
                            "Black",
                            "Sport",
                            2020,
                            45000.00,
                            2,
                            "Germany",
                            false,
                            6,
                            true,
                            false);

        Car car01 = new CarBuilder().setMake("BMW").setModel("325i").setColor("Black").build();
        Car car02 = new CarBuilder().setYear(2023).setNumberOfDoors(4).build();

        System.out.println(car02.getYear());
        System.out.println(car01.getMake());
    }
}
