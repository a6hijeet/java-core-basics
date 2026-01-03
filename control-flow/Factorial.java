class Factorial
{
    static int getFactorial(int num)
    {
        int f= 1;
        for (int i=0; i<num; i++)
        {
            f *= (i+1);
        }
        return f;
    }

    public static void main (String[] args)
    {
        System.out.println(Factorial.getFactorial(10));
    }
}