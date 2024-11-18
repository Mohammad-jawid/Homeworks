package chineasezodiac;

import java.util.Scanner;

public class ChineaseZodiac {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" PLEASE ENTER A YEAR");
        int year = input.nextInt();

        switch (year % 12) {
            case 0:
                System.out.println("Monkey year");
                break;
            case 1:
                System.out.println("Rooster year");
                break;
            case 2:
                System.out.println("Dog year");
                break;
            case 3:
                System.out.println("Pig year");
                break;
            case 4:
                System.out.println("Rat year");
                break;
            case 5:
                System.out.println("Ox year");
                break;
            case 6:
                System.out.println("Tiger year");
                break;
            case 7:
                System.out.println("Rabbit year");
                break;
            case 8:
                System.out.println("Dragon year");
                break;
            case 9:
                System.out.println("Snack year");
                break;
            case 10:
                System.out.println("Horse year");
                break;
            case 11:
                System.out.println("Sheep year");
                break;
            default:
                System.out.println("An invalid number");
        }
    }

}
