package programme18;

import java.util.Scanner;
public class SumFormula {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Input the first number");//calling wizard for user
        int n1 = s.nextInt();

        System.out.println("Input the second number");//calling wizard for user
        int n2 = s.nextInt();

        //sum
        System.out.println(n1 + "+" + n2 + "=" + (n1+n2));
        //subtract
        System.out.println(n1 + "-" + n2 + "=" + (n1-n2));
        //multiply
        System.out.println(n1 + "*" + n2 + "=" + (n1*n2));
        //divide
        System.out.println(n1 + "/" + n2 + "=" + (n1/n2));
        //mod
        System.out.println(n1 + "mod" + n2 + "=" + (n1%n2));





    }













}
