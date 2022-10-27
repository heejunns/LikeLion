package Day_10_05.Calculator_example;

public class Calculator {
    private int a;
    private int b;
    Calculator(int a,int b){
        this.a = a;
        this.b = b;
    }
    public void plus(){
        System.out.println(a+b);
    }
    public void minus(){
        System.out.println(a-b);
    }
    public void multiple() {
        System.out.println(a * b);
    }
    public void divide(){
        System.out.println(a/b);
    }
    public float divide2(){
        return (float)a/b;

    }
}