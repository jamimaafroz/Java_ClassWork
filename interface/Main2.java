import java.util.ArrayList;
import java.util.List;

interface Audible {
    void makeSound();
}

class Dog implements Audible {
    @Override
    public void makeSound() {
        System.out.println("Dog says WOOF! WOOF!");
    }
}

class Cat implements Audible {
    @Override
    public void makeSound() {
        System.out.println("Cat says MEOW MEOW!");
    }
}

public class Main2 {
    public static void main(String[] args) {
        List<Audible> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Dog());
        animals.add(new Cat());
        for (Audible a : animals) {
            a.makeSound();
        }
    }
}