/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class One {
    One(int x) {
        System.out.println("Constructor of class One: " + x);
    }
}

class Two extends One {
    Two(int x) {
        super(x); 
        System.out.println("Constructor of class Two");
    }
}

public class prob4 {
    public static void main(String[] args) {
        Two obj = new Two(10);  
    }
}
