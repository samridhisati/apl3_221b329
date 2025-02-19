
public class Test implements Testable {
    @Override
    public void display() {
        System.out.println("This is a Test class implementation of display.");
    }
    public static void main(String[] args) {
        Test test = new Test();
        test.display();  
    }
}
