abstract class Voice2 {
    // Template Method enforcing the correct sequence
    public final void templateMethod() {
        prepareVoice();
        hear();
    }

    // Abstract methods to be implemented by subclasses
    protected abstract void prepareVoice();
    protected abstract void hear();
}

// Example subclass for Dog
class DogVoice extends Voice2 {
    @Override
    protected void prepareVoice() {
        System.out.println("Warming up the dog's voice...");
    }

    @Override
    protected void hear() {
        System.out.println("Dog barks: Woof! Woof!");
    }
}

// Example subclass for Cat
class CatVoice extends Voice2 {
    @Override
    protected void prepareVoice() {
        System.out.println("Warming up the cat's voice...");
    }

    @Override
    protected void hear() {
        System.out.println("Cat meows: Meow! Meow!");
    }
}

// Main class to test the implementation
public class Main {
    public static void main(String[] args) {
        Voice2 dog = new DogVoice();
        dog.templateMethod();  // Enforces correct order

        System.out.println();

        Voice2 cat = new CatVoice();
        cat.templateMethod();   
    }
}
