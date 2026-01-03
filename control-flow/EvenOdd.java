class EvenOdd
{
    boolean isNegative(int num)
    {
        return num < 0;
    }
    boolean isEven(int num)
    {
        return (num % 2 == 0);
    }
    public static void main (String[] args)
    {
        EvenOdd e = new EvenOdd();
        System.out.println(e.isEven(5));
        System.out.println(e.isNegative(-6));
    }
}