import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        //Scanner to input the number
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N to compute the Nth prime number: ");

        //Read input from user
        int n = sc.nextInt();
        int num, count, i;
        num = 1;
        count = 0;

        while (count < n)
        {
            num = num + 1;
            for (i = 2; i <= num; i++)
            {
                if (num % i == 0)
                {
                    break;
                }
            }
            if (i == num)
            {
                count = count + 1;
            }
        }
        System.out.println("Value of Nth prime: " + num);
    }
}