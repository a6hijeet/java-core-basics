class Fibonacci
{

    int getNextNumber(int i, int j)
    {
        return i + j;
    }
    public static void main (String[] args)
    {
        // Defaults
        int x = 0;
        int y = 1;

        // No of items to print in series
        int count = 15;
        int z;
        Fibonacci f = new Fibonacci();
        for(int i=2; i<=count; i++)
        {
            System.out.print(x + " ");
            z = f.getNextNumber(x, y);
            
            x = y;
            y = z;
            
        }

    }
}