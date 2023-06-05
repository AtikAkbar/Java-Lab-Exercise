package Lab_6;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(){
        this.numerator = 0;
        this.denominator = 0;
    }

    public Fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return this.denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    @Override
    public String toString() {
        return this.numerator + "/" + this.denominator; 
    }

    public void add(Fraction fraction) {
        int newDenominator = this.denominator * fraction.denominator;
        int newNumerator = this.numerator * fraction.denominator + fraction.numerator * this.denominator;   
        this.numerator = newNumerator;
        this.denominator = newDenominator;
    }

    public void sub(Fraction fraction) {
        int newNumerator = this.numerator * fraction.denominator - fraction.numerator * this.denominator;
        this.numerator = newNumerator;
        this.denominator *= fraction.denominator;
    }

    public void multiplication(Fraction fraction) {
        this.numerator *= fraction.numerator;
        this.denominator *= fraction.denominator; 
    }

    public void division(Fraction fraction) {
        this.numerator *= fraction.denominator;
        this.denominator *= fraction.numerator;
    }
}
