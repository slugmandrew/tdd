package math;

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
        if(this.denominator != that.denominator)
        {
            return new Fraction(this.numerator * that.denominator + that.numerator * this.denominator, this.denominator * that.denominator);
        }
        else
        {
            return new Fraction(this.numerator + that.numerator, denominator);
        }


    }

    public int intValue()
    {
        return numerator;
    }

    @Override
    public boolean equals(Object o)
    {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;

        Fraction that = (Fraction) o;

        return Objects.equal(this.numerator, that.numerator) &&
                Objects.equal(this.denominator, that.denominator);
    }

    @Override
    public String toString()
    {
        return String.format("%d/%d", numerator, denominator);
    }

    @Override
    public int hashCode()
    {
        return Objects.hashCode(numerator, denominator, 31);
    }
}
