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
}

class prob3_2 {
    public static void main(String[] args) {
        Mother m1 = new Child();
        m1.show(); 
        Mother m = new Mother();
        m.show(); 
    }
}
