package HomeWork3_3;

public class Task5Function {
    public static void main(String[] args) {
    }

    public static int min(int a, int b, int c, int d) {
        if(min(a,b) < min(c,d))
            return min(a, b);
        else return min (c,d);
    }

    public static int min(int minimum, int maximum) {
        if (minimum > maximum)
            return minimum;
        else return maximum;
    }

}
