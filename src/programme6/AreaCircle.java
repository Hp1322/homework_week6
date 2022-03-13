package programme6;

import java.util.Scanner;//importing scanner
public class AreaCircle {
    public static void main(String[] args) {
        int r;
        double pi = 3.14,area;//double-datatype
        Scanner s = new Scanner(System.in);//using scanner object
        System.out.println("radius of circle:");
         r = s.nextInt();
         area = pi*r*r;
        System.out.println("Area of circle:"+area);



    }
}
