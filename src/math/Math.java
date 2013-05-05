
package math;

/**
 * Simple maths class.
 */ 
public class Math
{
    /**
     * Add two values and return the result.
     *
     * @param a Integer, greater than or equal to 0.
     * @param b Integer, greater than or equal to 0.
     * @return a + b
     * @throws IllegalArgumentException if a or b are less than zero.
     */
    public static int sum(int a, int b)
    {
        if ((a < 0) || (b < 0))
        {
            throw new IllegalArgumentException("Arguments must be >= 0");
        }
        return a + b;
    }

    public static final void main(String[] args)
    {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.print("Summing " + a + " and " + b);
        int c = Math.sum(a, b);
        System.out.println(" to get " + c);
    }
}
