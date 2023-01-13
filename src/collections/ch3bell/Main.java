package collections.ch3bell;

public class Main
{
    public static void main(String[] args)
    {
        int n = 5;
        int[][] a = new int[6][6];
        a[1][1]=1;
        for(int i=1; i<=5; i++)
        {
            for(int j=1; j<=i; j++)
            {
                a[i][j+1]=a[i][j]+a[i][j+1];
                int b=a[i+1][j+1];
                System.out.print(a[i][j]);
            }
            System.out.println();
        }

    }
}

