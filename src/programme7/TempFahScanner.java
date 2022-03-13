package programme7;

import java.util.Scanner;// Import Scanner
public class TempFahScanner {
    public static void main(String[] args) {

        Scanner p = new Scanner(System.in);//calling scanner object

        System.out.println("Enter value in degree F:");
        double fahrenheit = p.nextInt();

        //convert fahrenheit to celsius using formula

        double celsius = ((fahrenheit-32.0)*5) / 9.0;
        System.out.println(fahrenheit + "degree fahrenheit is equal to " + celsius +" in Celsius");

    }

}
