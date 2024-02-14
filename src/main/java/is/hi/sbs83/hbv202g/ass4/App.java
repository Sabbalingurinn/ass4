package is.hi.sbs83.hbv202g.ass4;
import org.apache.commons.numbers.primes.Primes;
/**
 * next prime number
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int frumtala = 123456789;
        System.out.println(Primes.nextPrime(frumtala));
    }
}
