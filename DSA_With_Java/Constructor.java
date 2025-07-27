public class Constructor {
    // Constructor with no parameters
    public Constructor() {
        System.out.println("Default constructor called.");
    }

    // Constructor with one parameter
    public Constructor(int value) {
        System.out.println("Constructor with value: " + value);
    }

    // Constructor with two parameters
    public Constructor(int value1, int value2) {
        System.out.println("Constructor with values: " + value1 + " and " + value2);
    }

    public static void main(String[] args) {
        // Creating objects using different constructors
        Constructor obj1 = new Constructor();
        Constructor obj2 = new Constructor(10);
        Constructor obj3 = new Constructor(20, 30);
    }

    public void display() {
        System.out.println("Display method called.");
    }

    public void show() {
        System.out.println("Show method called.");
        display();
    }

    public void print() {
        System.out.println("Print method called.");
    }
}
