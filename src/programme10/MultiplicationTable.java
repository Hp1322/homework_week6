package programme10;

import java.util.Scanner; // Import scanner Utility

public class MultiplicationTable {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in); //Calling a Scanner Object

        System.out.println("Enter number:"); //Input wizard for a user
        int a = s.nextInt();

        for (int i = 1; i <= 10; i++)//for loop
            System.out.println(a + " X " + i + " = " + (a * i));


    }

}
