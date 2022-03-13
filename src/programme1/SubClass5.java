package programme1;

public class SubClass5 {
    //1.5 calling instance method into main method

    int a =10;//instance variable
    String name = "Harsh";//instance variable

    //instance method
    public void test1(){
        System.out.println(a);
        System.out.println(name);
    }

    //calling instance method into main method
    public static void main(String[] args) {
        SubClass5 p = new SubClass5();// object name = p
        p.test1();

    }
}
