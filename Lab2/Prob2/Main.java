abstract class Voice2 {
    public final void templateMethod() {
        prepareVoice();
        hear();
    }

    protected abstract void prepareVoice();
    protected abstract void hear();
}

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

public class Main {
    public static void main(String[] args) {
        Voice2 dog = new DogVoice();
        dog.templateMethod();  

        System.out.println();

        Voice2 cat = new CatVoice();
        cat.templateMethod();   
    }
}
