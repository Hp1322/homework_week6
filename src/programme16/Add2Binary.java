package programme16;

import java.util.Scanner;//Importing scanner
public class Add2Binary {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first binary number:");//calling wizard for user
        String a = s.next();

        System.out.println("Enter second binary number:");//calling wizard for user
        String b = s.next();

        int n1=Integer.parseInt(a,2);
        int n2=Integer.parseInt(b,2);
        int n3=n1+n2;

        System.out.println("n1 : "+Integer.toBinaryString(n1));
        System.out.println("n2 : "+Integer.toBinaryString(n2));
        System.out.println("n3=n1+n2 : "+Integer.toBinaryString(n3));


    }

}
