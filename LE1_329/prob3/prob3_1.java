/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class Mother {
    void show() {
        System.out.println("Mother's show()");
    }
}
class Child extends Mother {
    @Override
    void show() {
        System.out.println("Child's show()");
    }
}
class prob3_1 {
    public static void main(String[] args) {
        Mother m1 = new Child();
        m1.show();
        Mother m = new Mother();
        m.show(); 
    }
}
