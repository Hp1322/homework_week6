package programme13;

import java.util.Scanner;//Importing scanner
public class Average {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in); //calling scanner object
        System.out.println("Enter first number");
        int n1 = s.nextInt();

        System.out.println("Enter second number");//calling wizard for user
        int n2 = s.nextInt();

        System.out.println("Enter third number");//calling wizard for user
        int n3 = s.nextInt();

        System.out.println("Average of three number:" +(n1+n2+n3)/3);

    }
}
