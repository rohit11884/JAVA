class Base {
    Base() {
        System.out.println("I am a constructor");
    }

    Base(int a, int b) {

        System.out.println("I am a overloaded constructor of value " + a + " and " + b);
    }

    Base(int x) {
        System.out.println("I am a constructor with value of x is " + x);
    }
}

class Derived extends Base {
    Derived() {
        // By writing keyword super paramiterrized constructor will invoke from base class
        super(10, 22);
        System.out.println("I am a derived class constructor");
    }

    Derived(int x, int y) {
        super(x);
        System.out.println("I am a derived class overloaded constructor with value of y is " + y);
    }
}

class Childofderived extends Derived {
    Childofderived() {
        System.out.println("I am child of derived class constructor");
    }

    Childofderived(int x, int y, int z) {
        super(x, y);
        System.out.println("I am child of derived class overloaded constructor with value of z is " + z);
    }
}

public class constructor_in_inheritance {
    public static void main(String[] args) {
        Childofderived d = new Childofderived(10, 23, 45);
    }
}
