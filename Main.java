import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Kaca kadar:");
        int a = input.nextInt();
        for(int i=2; i<=a; i++)
        {
            int r = 0;
            for(int j=2; j<i; j++)
            {
                if(i%j==0)
                {
                   r=1;
                }
            }
            if(r==0)
            {
                System.out.println(i);
            }
        }
    }
}