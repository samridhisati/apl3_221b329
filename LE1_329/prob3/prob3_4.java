/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class Mother {
    static void show() {
        System.out.println("Mother's static show()");
    }
}
class Child extends Mother {
    static void show() {
        System.out.println("Child's static show()");
    }
}
class prob3_4 {
    public static void main(String[] args) {
        Mother m1 = new Child();
        m1.show();
        Mother m = new Mother();
        m.show(); 
        Child ch = new Child();
        ch.show(); 
    }
}