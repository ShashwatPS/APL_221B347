class Mother {
    public String show() {
        return "Hello World";
    }
}

class Child extends Mother {
    @Override
    public String show() {
        return "Hello JUET";
    }
}

public class que {
    public static void main(String[] args) {
       
        Mother mother = new Mother();
        System.out.println("Mother says: " + mother.show());

        Mother childAsMother = new Child();
        System.out.println("Child (as Mother) says: " + childAsMother.show());

        Child child = new Child();
        System.out.println("Child says: " + child.show());
    }
}

