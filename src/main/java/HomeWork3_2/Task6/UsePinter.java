package HomeWork3_2.Task6;

public class UsePinter {
    static Printer sumsung = new Printer( "sumsung", "XR3",true,
            "Laser", "Yes", 100, 100,
            100, 100, 13);

    public static void main(String[] args) {
        sumsung.fillUp();
        sumsung.printPage(13);
    }
}
