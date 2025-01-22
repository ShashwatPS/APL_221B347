// Class One with a parameterized constructor
class One {
    int x;
    public One(int x) {
        this.x = x;
    }
}

// Class Two derived from One
class Two extends One {
    public Two(int x) {
        super(x); 
    }
}

// Test class
public class que {
    public static void main(String[] args) {
        // Create an object of class Two
        One o = new Two(10);
        Two t = new Two(20);
        System.out.println(o.x);
        System.out.println(t.x);
    }
}
