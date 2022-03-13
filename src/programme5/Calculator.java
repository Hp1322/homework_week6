package programme5;

public class Calculator {

    int a = 10;//Instance variable
    int b = 20;//Instance variable
    static int c = 30;//Static variable
    static int d = 40;//Static variable

    //Instance method
    public void addition() {
        System.out.println("Addition "+ "= "+(a+b));
        System.out.println("Addition "+ "= " +(b+c));
    }
    public void subtraction(){
            System.out.println("subtraction "+"= "+(c-a));
            System.out.println("subtraction "+"= "+(d-b));
        }

     //Static method
    public static void multiplication(){
        Calculator t = new Calculator();
        System.out.println("multiplication "+"= "+(t.a*c));
        System.out.println("multiplication "+"= "+(t.b*d));

    }
    public static void division(){
        Calculator r = new Calculator();
        System.out.println("division "+"= "+(c/r.a));
        System.out.println("division "+"= "+(d/r.b));

    }

    //main method
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        //Calculator t = new Calculator();
        obj.addition();
        obj.subtraction();
        multiplication();
        division();
    }
}
