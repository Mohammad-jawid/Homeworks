package task11;

public class Task11 {

    public static void main(String[] args) {
        int x = 8;
        int y = 100;
        
        System.out.println(x);
        System.out.println(y);

        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("");
        System.out.println(x);
        System.out.println(y);

    }

}
