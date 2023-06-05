package Lab_6;

/*
 * --------------------
 * Fraction
 * -----------------
 * - numerator : int
 * - denominator : int
 * -----------------------
 * + Fraction(numerator : int, denominator : int)
 * + getNumerator(): int
 * + setNumerator(numerator:int) : void
 * + getDenominator():int
 * + setDenominator(numerator:int):void
 * + toString() : String
 * + add(fraction : Fraction) : void
 * + sub(fraction : Fraction) : void
 * + multiplication(fraction : Fraction) : void
 * + division(fraction : Fraction) : void
 * ------------------------
 * 
 * ## void add(Fraction fraction) ##
 * Adds two Fraction objects and stores the result into the calling object. This
 * is how addition is
 * performed for fractions:
 * 1/4+3/5 = 1*5+3*4/4*5=17/20
 * 
 * ## String toString() ##
 * Returns the value of the fraction in 1 / 2 format where 1 is numerator and 2 is denominator.
 * 
 * Now write a test program that performs the following steps:
 * Take two Fraction objects and print both of them.
 * Test add, sub, multiplication and division methods.
 * Print calling object after each method call.
 */

public class App {
    public static void main(String[] args) {
        Fraction fraction1 = new Fraction(1,4);
        Fraction fraction2 = new Fraction(3,5);

        System.out.println(fraction1.toString());
        System.out.println(fraction2.toString());

        fraction1.add(fraction2);
        System.out.println("After Addition = " + fraction1.toString());

        fraction1.sub(fraction2);
        System.out.println("After Substruction = " + fraction1.toString());

        fraction1.multiplication(fraction2);
        System.out.println("After Multiplication = " + fraction1.toString());

        fraction1.division(fraction2);
        System.out.println("After Division = " + fraction1.toString());
    }
}



