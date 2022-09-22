import java.util.ArrayList;

public class EratosthenesPrimeSieve implements PrimeSieve{
    private int limit;
    private ArrayList<Integer> primes;
    private boolean[] marked;

    public EratosthenesPrimeSieve(int limit) {
        this.limit = limit;
        primes = new ArrayList<>();
    }

    @Override
    public boolean isPrime(int p) {
        if (marked[p+2] == true)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    @Override
    public void printPrimes() {
        for (int i = 0; i < primes.size(); i++)
        {
            System.out.println(primes.get(i));
        }
    }

    public void primeSieve()
    {
        for (int i = 2; i < limit; i++)
        {
            marked[i] = false;
        }

        for (int i = 2; i < Math.sqrt(limit); i++)
        {
            if (!isPrime(i))
            {
                primes.add(i);

                for (int j = i * i; j < limit; )
                {
                    marked[i] = true;
                }
            }
        }
    }
}
