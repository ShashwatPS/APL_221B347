class Mother {
    int x = 10;

   
    public void show() {
        System.out.println("This is the show() method of the Mother class.");
        System.out.println("Value of x in Mother class: " + x);
    }
}


class Child extends Mother {
    
}

public class que {
    public static void main(String[] args) {
        
        Mother m = new Mother();
        m.show(); 

        System.out.println(); 


        Child ch = new Child();
        ch.show(); 
    }
}
