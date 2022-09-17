package immutableObjPattern;

import java.util.ArrayList;
import java.util.List;

public class Animal {
    private final String name;
    private final int age;
    private final List<String> food;

    public Animal(String name, int age, List<String> food) {
        this.name = name;
        this.age = age;
        this.food = new ArrayList<>(food);
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public List<String> getFood() {
        return new ArrayList<>(food);
    }
}
