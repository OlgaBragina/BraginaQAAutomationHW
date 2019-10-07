package HomeWork3_3;

public class Task3FillArray {
    public static void main(String[] args) {
        int[] array= new int [102];
        for (int i=0; i<=100; i++) {
            //array[i] = i;


            array[101-i] = i;
            System.out.println("New Array number " + array[101-i]);

        }

    }
}
