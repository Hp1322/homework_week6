package programme15;

import java.util.Scanner;//importing scanner
public class Swap {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);//calling scanner object

        int a,b,c;

        System.out.println("Input first number: ");//calling
        a = s.nextInt();
        System.out.println("Input second number: ");
        b = s.nextInt();

        c=a;
        a=b;
        b=c;

        System.out.println("Swapped value are:" + a + " and " + b);

    }

}
