import java.util.Scanner;

public class MyMain {

    // Calculates the median of the three inputs
    public static int median(int a, int b, int c) {
        if (b < a && a<c || c < a && a < b) {
            return a;
        }
        else if (a < b && b<c || c < b && b < a) {
            return b;
        }
        else{
            return c;
        }
    }
    // Returns the input with the larger absolute value
    public static int magnitude(int a, int b) {
        if (Math.abs(a)>Math.abs(b)){
            return a;
        }
        else{
            return b;
        }
    }

    // Returns the "c" value from the Pythagorean theorem "a^2 + b^2 = c^2",
    // where "a" and "b" are the inputs to the method
    public static double pythagoras(int a, int b) {
        return Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
    }

    public static void main(String[] args) {
        // You may want to keep these lines of code to test that your methods work
        /*System.out.println(median(1, 2, 3)); // should be 2
        System.out.println(magnitude(-7, -1)); // should be -7
        System.out.println(pythagoras(3, 4)); // should be 5.0*/

        Scanner scan = new Scanner(System.in);
        System.out.println("What command would you like to carry out?");
        String command=scan.nextLine();
        if (command.equals("median")){
            System.out.print("first number?: ");
            int fnum=scan.nextInt();
            System.out.print("second number?: ");
            int snum=scan.nextInt();
            System.out.print("third number?: ");
            int tnum=scan.nextInt();
            System.out.println(median(fnum, snum, tnum));
        }
        else if (command.equals("magnitude")){
            int fnum=scan.nextInt();
            System.out.print("second number?: ");
            int snum=scan.nextInt();
            System.out.println(magnitude(fnum, snum));
        }
        else if (command.equals("pythagoras")){
            int fnum=scan.nextInt();
            System.out.print("second number?: ");
            int snum=scan.nextInt();
            System.out.println(pythagoras(fnum, snum));
        }
    }
}
