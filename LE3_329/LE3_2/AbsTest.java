
public abstract class AbsTest implements Testable {
    
}


class ConcreteTest extends AbsTest {
    @Override
    public void display() {
        System.out.println("This is the display method implemented in ConcreteTest.");
    }

    public static void main(String[] args) {
        
        ConcreteTest test = new ConcreteTest();
        test.display();  
    }
}
