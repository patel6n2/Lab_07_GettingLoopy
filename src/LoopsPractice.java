public class LoopsPractice
{
    public static void main(String[] args)
    {
        for (int i = 0; i <= 30; i++)
        {
            System.out.printf("%3d |", i);
        }
        System.out.println();
        for (int i = 30; i >= 0; i--)
        {
            System.out.printf("%3d |", i);
        }
        System.out.println();
        for (int i = 0; i <= 18; i += 3)
        {
            System.out.printf("%3d |", i);
        }
        System.out.println();
        for (int i = 10; i >= 0; i -= 2)
        {
            System.out.printf("%3d |", i);
        }
        System.out.println("\n");
        for (int i = 1; i <= 5; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 1; i <= 5; i++)
        {
            for (int j = 5; j >= i; j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 1; i <= 5; i++)
        {
            for (int j = 1; j <= 5; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i <= 5; i++)
        {
            for (int j = 0; j <= 5; j++)
            {
                if (j == 0 || j == 5 || i == j)
                {
                    for (int k = 1; k <= 2; k++)
                    {
                        System.out.print("*");
                    }
                }
                else
                {
                    for (int k = 1; k <= 2; k++)
                    {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}