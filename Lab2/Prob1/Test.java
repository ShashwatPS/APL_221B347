// Base class
abstract class Animal {
    abstract void makeVoice();
}

// Subclasses with specific implementations
class Cow extends Animal {
    @Override
    void makeVoice() {
        System.out.println("Cow says Moo!");
    }
}

class Dog extends Animal {
    @Override
    void makeVoice() {
        System.out.println("Dog says Woof!");
    }
}

class Pig extends Animal {
    @Override
    void makeVoice() {
        System.out.println("Pig says Oink!");
    }
}

class Goat extends Animal {
    @Override
    void makeVoice() {
        System.out.println("Goat says Baa!");
    }
}

class Lion extends Animal {
    @Override
    void makeVoice() {
        System.out.println("Lion says Roar!");
    }
}

// Voice class to manage the animals
class Voice {
    private Animal[] animals = new Animal[5];

    void prepareVoice() {
        animals[0] = new Cow();
        animals[1] = new Dog();
        animals[2] = new Pig();
        animals[3] = new Goat();
        animals[4] = new Lion();
    }

    void hear() {
        for (Animal animal : animals) {
            animal.makeVoice();
        }
    }
}

// Test class with main method
public class Test {
    public static void main(String[] args) {
        Voice voiceSystem = new Voice();
        voiceSystem.prepareVoice();
        voiceSystem.hear();
    }
}
