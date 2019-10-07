package HomeWork3_3;

public class Task1Loops {
    public static void main(String[] args) {

        System.out.println("Print from 10 to 20 using For");
        for (int i = 10; i <= 20; i++) {
            System.out.println("Number = " + i);}



            System.out.println("Print from 10 to 20 using Do While");
            int x = 10;
            do {
                System.out.println("Number = " + x);
                x++;
            }
            while (x <= 20);

            System.out.println("Print from 10 to 20 using For Each");
            int[] digits = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        for (int j:digits)
        {
            System.out.println("Array Number = " + j);

        }

        System.out.println("Print from 10 to 20 using While");
        int y=10;
        while (y<=20){
            System.out.println("Number = " + y);
            y++;
        }
        }
    }


