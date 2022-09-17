package builderPattern;

public class CarBuilder {
    private String make;
    private String model;
    private String color;
    private String trim;
    private int year;
    private double price;
    private int numberOfDoors;
    private String madeCountry;
    private boolean isRebuild;
    private double cylinder;
    private boolean isAutoTransmission;
    private boolean isTurbo;

    public CarBuilder setMake(String make) {
        this.make = make;
        return this;
    }

    public CarBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    public CarBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public CarBuilder setTrim(String trim) {
        this.trim = trim;
        return this;
    }

    public CarBuilder setYear(int year) {
        this.year = year;
        return this;
    }

    public CarBuilder setPrice(double price) {
        this.price = price;
        return this;
    }

    public CarBuilder setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
        return this;
    }

    public CarBuilder setMadeCountry(String madeCountry) {
        this.madeCountry = madeCountry;
        return this;
    }

    public CarBuilder setRebuild(boolean rebuild) {
        isRebuild = rebuild;
        return this;
    }

    public CarBuilder setCylinder(double cylinder) {
        this.cylinder = cylinder;
        return this;
    }

    public CarBuilder setAutoTransmission(boolean autoTransmission) {
        this.isAutoTransmission = autoTransmission;
        return this;
    }

    public CarBuilder setTurbo(boolean turbo) {
        this.isTurbo = turbo;
        return this;
    }


    public Car build() {
        Car car = new Car(make, model, color, trim, year, price, numberOfDoors, madeCountry, isRebuild, cylinder, isAutoTransmission, isTurbo);
        return car;
    }
}
