package programme14;

public class Rectangle {
    public static void main(String[] args) {
        float Width = 5.6f;
        float Height = 8.5f;

        float area = Width*Height;
        float perimeter = 2*(Width+Height);

        System.out.println("area is " +Width+ "*" +Height+ "=" + area);//area is 5.6 * 8.5 = 47.60
        System.out.println("perimeter is " +2 +"*"+"("+Width+"+"+Height+")"+"=" +perimeter);//Perimeter is 2 * (5.6 + 8.5) = 28.20


    }

}
