package programme3;

public class InstanceNStatic {
    int x = 1;//instance variable
    static int y =2;//static variable

    //declaring instance method
    public void test1(){
        System.out.println(x);//calling instance variable into instance method

    }
    //declaring static method
    public static void test2(){
        System.out.println(y);//calling static variable into static method

    }
    //calling instance and static methods into main method
    public static void main(String[] args) {   //main method
        InstanceNStatic obj = new InstanceNStatic();// obj = object
        obj.test1();
        test2();
    }

}
