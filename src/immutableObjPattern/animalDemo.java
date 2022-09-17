package immutableObjPattern;

import java.util.Arrays;

public class animalDemo {
    public static void main(String[] args) {
        /*
        Immutable Objects Pattern

        Problem: How do we create read-only objects that can be shared and
        used by multiple classes?

        Motivation: Sometimes we want to create simple objects that can be
        shared across multiple classes, but we don’t want their value to be
        modified.

        Solution: The immutable object pattern is a creational pattern based
        on the idea of creating objects whose state does not change after they
        are created. Immutable objects go hand and hand with encapsulation,
        except that no setter methods exist that modify the object. Since the
        state of an immutable object never changes, they are inherently
        thread-safe.

        ---------------------------------------------------------------------------
        We want to make sure that once object is created with initial values,
        it is not changeable
        */

        Animal animal = new Animal("Tiger", 3, Arrays.asList("deer", "goat", "rabbit"));
        System.out.println(animal.getName());
        System.out.println(animal.getAge());
        System.out.println(animal.getFood());
    }
}
