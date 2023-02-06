package numeric;

/**
 *
 * @author Caleb Willson
 * @version 2.0
 * File: Factorial.java
 * Created: 1/18/23
 * Edited:  2/1/23
 * 
 * Takes one int from the command line, factorials it, and
 * prints it to the command line.
 * 
 * Version 2.0: Added NegativeFactorialException
 *              Removed unnecessary multiplication by 1
 */
public class Factorial {
    /**
     * 
     * @param x
     * @return x!
     * @throws IllegalArgumentException 
     */
    public static double compute(int x) throws NegativeFactorialException {
        double result = 1;
        
        if (x < 0) {
            throw new NegativeFactorialException("Cannot take the factorial "
                                                + "of a negative number.");
        }
        else if (x != 0) {
            for (int i = x; i > 1; i--) {
                result = result * i;
            }
        }
        
        return result;
    }
    
    /**
     * Main function for the Factorial class
     * 
     * @param args Takes one int to apply the compute to
     */
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Invalid number of arguments. Expected 1"
                                + " but recieved " + args.length + ".");
            return;
        }
        int x = Integer.parseInt(args[0]);
        double f = 0.0;
        
        try {
            f = compute(x);
            System.out.println(f);
        }
        catch (NegativeFactorialException e) {
            System.out.println(e);
        }
        
    }
}
