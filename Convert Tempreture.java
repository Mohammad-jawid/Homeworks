package task13;

import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the tempreture in Farenheit: ");

        double f = input.nextDouble();
        double c = (f - 32) * 5 / 9;
        System.out.println("The tempreture in Celcius is : " + c);

    }

}
