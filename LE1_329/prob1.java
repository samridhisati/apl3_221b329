/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class Mother{
    int x=30;
    void show(){
        System.out.println("Value of x in mother:"+x);
    }
}
class Child extends Mother{
    
}
class prob1{
    public static void main(String[] args){
        Mother m=new Mother();
        m.show();
        Child c=new Child();
        c.show();
    }
}