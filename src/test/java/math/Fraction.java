package math;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

/**
 * @author Drew Spencer
 */
public class Fraction
{
    private final int numerator;
    private final int denominator;

    public Fraction(int integerValue)
    {
        this(integerValue, 1);
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

    @Override
    public boolean equals(Object other)
    {
        if(other instanceof Fraction)
        {
            Fraction that = (Fraction) other;
            return (this.numerator == that.numerator) && (this.denominator == that.denominator);
        }
        return false;
    }

    @Override
    public String toString()
    {
        return String.format("%d/%d", numerator, denominator);
    }

}
