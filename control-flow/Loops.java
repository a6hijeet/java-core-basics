class Loops
{
    public static void main (String[] args)
    {
        System.out.println("For Loop");
        for (int i=0; i<7; i++)
        {
            System.out.print(i + " ");
        }
        System.out.println("\nwhile Loop");
        int i = 0;
        while (i < 4)
        {
            System.out.print(i + " ");
            i++;
        }
        System.out.println("\ndo while Loop");
        do
        {
            System.out.print(i + " ");
            i++;
        }while(i < 10);
    }
}