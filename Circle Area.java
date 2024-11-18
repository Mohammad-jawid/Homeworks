package task12;

import java.util.Scanner;

public class Task12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Radius:  ");
        double radius = input.nextDouble();
        final double PI =3.14;
        
        double area = PI * radius * radius;
        
        System.out.println("the area is: "+area);
        
     

    }
    
}
