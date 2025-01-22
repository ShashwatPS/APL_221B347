class Mother {
    public void show() {
        System.out.println("This is the instance show() method of Mother.");
    }
}

class Child extends Mother {
    @Override
    public void show() {
        System.out.println("This is the instance show() method of Child.");
    }
}

public class que {
    public static void main(String[] args) {
        
        Mother m = new Mother();
        m.show(); 

        Child ch = new Child();
        ch.show();

        Mother m1 = new Child();
        m1.show(); 
    }
}
