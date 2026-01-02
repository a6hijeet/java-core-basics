class Array 
{
    public static void main(String[] a)
    {
        // Adding value to array
        int num[] = {4,5,6,7};

        for(int i=0; i<num.length; i++)
        {
            System.out.println(num[i]);
        }
        // Create blank multidimesional array 
        int num2[][] = new int[3][4];
        // Assigning values to array
        for(int i=0; i<num2.length; i++)
        {
            for(int j=0; j<num2[i].length; j++)
            {
                num2[i][j] = (int) (Math.random() * 100);
            }
        }
        for(int i=0; i<num2.length; i++)
        {
            for(int j=0; j<num2[i].length; j++)
            {
                System.out.print(num2[i][j] + " ");
            }
            System.out.println();
        }

        int jagged[][] = new int[3][];

        jagged[0] = new int[3];
        jagged[1] = new int[5];
        jagged[2] = new int[4];
        for(int i=0; i<jagged.length; i++)
        {
            for(int j=0; j<jagged[i].length; j++)
            {
                jagged[i][j] = (int) (Math.random() * 100);
            }
        }
        for(int i=0; i<jagged.length; i++)
        {
            for(int j=0; j<jagged[i].length; j++)
            {
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println();
        }

        for(int n[]: jagged)
        {
            for(int b: n)
            {
                System.out.print(b + " ");
            }
            System.out.println();
        }


        // 3-dimenstional array
        int threeD[][][] = new int[3][4][5];

        for(int i=0; i<threeD.length; i++)
        {
            for(int j=0; j<threeD[i].length; j++)
            {
                for(int k=0; k<threeD[i][j].length; k++)
                {
                    threeD[i][j][k] = (int)(Math.random() * 100);
                }
            }
        }
        for(int i=0; i<threeD.length; i++)
        {
            for(int j=0; j<threeD[i].length; j++)
            {
                for(int k=0; k<threeD[i][j].length; k++)
                {
                    System.out.print(threeD[i][j][k] + " ");
                }
                System.out.println();
            }
             System.out.println();
        }
    }
}