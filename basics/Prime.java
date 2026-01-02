class Prime
{
    boolean isPrime (int num)
    {
        if (num <= 1)
            return false;
        
        for (int i=2; i<num; i++)
        {
            if (num % i == 0) 
                return false;
        }

        return true;
    }
    public static void main (String[] args)
    {
        Prime p = new Prime();

        int count = 50;
        for (int i=2; i<=count; i++)
        {
            System.out.print(p.isPrime(i) ? i + " " : "");
        }

    }
}