/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class Mother{
    void show(){
        System.out.println("Hello World");
    }
}
class Child extends Mother{
    @Override
    void show(){
        System.out.println("Hello JUET");
    }
}
class prob2{
    public static void main(String[] args){
        Mother m=new Mother();
        m.show();
        Child c=new Child();
        c.show();
        Mother mc=new Child();
        mc.show();
    }
}