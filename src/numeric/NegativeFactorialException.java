/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package numeric;

/**
 *
 * @author Caleb Willson
 * @version 1.0
 * File: NegativeFactorialException.java
 * Created 2/3/23
 * 
 * Exception used by Factorial.java when a negative 
 * number is given.
 */
public class NegativeFactorialException extends RuntimeException {
    public NegativeFactorialException (String err) {
        super(err);
    }
}
