package day1;

public class TestDivide {
    // Driver code
    public static void main(String []args)
    {
       int N = 100;

        result(N);
    }
    public static void result(int N)
    {
        for (int num = 0; num < N; num++)
        {
            // Short-circuit operator is used
            if (num % 3 == 0 && num % 5 == 0)
                System.out.print(num + " ");
        }
    }


}

