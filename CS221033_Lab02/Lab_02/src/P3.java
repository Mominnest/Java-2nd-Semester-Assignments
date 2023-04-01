import java.util.Scanner;

public class P3
{

    public static void main(String ar[])
    {
        Scanner s = new Scanner(System.in);



        System.out.println("Enter number of rows for the pyramid:");

        int nrows = s.nextInt();



        int rowCount = nrows;

        System.out.println("Pyramid Pattern: ");



        for (int i = 0; i < nrows; i++)
        {


            for (int j = 1; j <= i*2; j++)
            {
                System.out.print(" ");
            }



            for (int j = 1; j <= rowCount; j++)
            {
                System.out.print(j+" ");
            }


            for (int j = rowCount-1; j >= 1; j--)
            {
                System.out.print(j+" ");
            }

            System.out.println();



            rowCount--;
        }
    }
}