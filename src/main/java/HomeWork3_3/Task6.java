package HomeWork3_3;

public class Task6 {
    public static void main(String[] args) {
getEvenDigitSum(7,8,-123,6);

    }       public static void getEvenDigitSum( int a, int b, int c, int d)
    {

        int sum;
        sum = a + b + c + d;


        if (sum < 0)
        {
            System.out.println("Negative number is result: -1");

        }
        else
            System.out.println("Positive number is result "+sum);


    }
}