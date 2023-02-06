package numeric;

/**
 *
 * @author Caleb Willson
 * @version 1.0
 * File: GCD.java
 * Created: 1/18/23
 * 
 * Takes two integers from the command line, calculates the GCD,
 * and prints it to the command line.
 */
public class GCD {
    /**
     * 
     * @param x The first int
     * @param y The second int
     * @return The GCD of the two integers
     */
    public static int compute(int x, int y) {
        int result;
        if (y == 0) {
            result = Math.abs(x);
        }
        else {
            result = compute(y, (x % y));
        }
        return result;
    }
    
    /**
     * Main function for the GCD class
     * 
     * @param args 
     */
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Invalid number of arguments. Expected 2"
                                + " but recieved " + args.length + ".");
            return;
        }
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        
        int g = compute(x, y);
        System.out.println(g);
    }
}
