package programme2;

public class Static5 {
    //static variables
    static int a1=20;
    static String name = "Patel";

    //static method
    public static void test2(){
        System.out.println(a1);
        System.out.println(name);
    }

    //calling static method into main method

    public static void main(String[] args) {
        test2();

    }

}
