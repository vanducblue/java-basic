package day6;

public class Practice {
    int x;  // Create a class attribute x

    // Create a class constructor for the MyClass class
    public Practice ( ) {
        x = 5;  // Set the initial value for the class attribute x to 5
    }

    public static void main(String[] args) {
        // Create an myObj object of class MyClass (This will call the constructor)
        Practice pract = new Practice();
        // Print the value of x
        System.out.println(pract.x);
    }
}
