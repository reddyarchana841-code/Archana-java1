// Encapsulation and Class/Object
class Animal {
    private String name;  // encapsulated data

    public Animal(String name) {
        this.name = name;
    }

    public void sound() {
        System.out.println("Animal makes a sound");
    }

    public String getName() {
        return name;
    }
}

// Inheritance and Polymorphism
class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println(getName() + " barks");
    }
}

public class oops{
    public static void main(String[] args) {
        Animal a = new Animal("Generic Animal");
        a.sound();

        Dog d = new Dog("Buddy");
        d.sound();  // Polymorphism - overridden method

        Animal a2 = new Dog("Max");
        a2.sound(); // Polymorphism in action (runtime)
    }
}
