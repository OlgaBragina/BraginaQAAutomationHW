package HomeWork3_3;

public class Task4ArraySumm {
    public static void main(String[] args) {
        int arraySum = 0;
        int[] array=new int[10];
        for (int i=0; i<array.length; i++)
        {
            array[i]=i;

        }

        for (int j=1; j<=8; j++)
        {
            arraySum=arraySum+array[j];
        }

        System.out.println("Summ of Array's integers expect first and last element is  "+arraySum);
    }
}
