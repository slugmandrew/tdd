package math;

/**
 * @author Drew Spencer
 */
public class Fraction
{
    private final int numerator;
    private final int denominator;

    public Fraction(int numerator)
    {
        this.numerator = numerator;
        this.denominator = 1;
    }

    public Fraction(int numerator, int denominator)
    {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction plus(Fraction that)
    {
        return new Fraction(this.numerator + that.numerator, denominator);
    }

    public int intValue()
    {
        return numerator;
    }

    public int getNumerator()
    {
        return numerator;
    }

    public int getDenominator()
    {
        return denominator;
    }
}
