package HomeWork3_2.Task6;

public class Printer {
    private String manufacture;
    private String model;
    private boolean isColor;
    private String type;
    private String isDuplex;
    private int tonerLevelBlack;
    private int tonerLeveMagenta;
    private int tonerLeveYellow;
    private int tonerLeveBlue;
    private int printedPages;

    Printer(String manufacture, String model, boolean isColor, String type, String isDuplex,
            int tonerLevelBlack, int tonerLeveMagenta,
            int tonerLeveYellow, int tonerLeveBlue, int printedPages) {

        this.manufacture = manufacture;
        this.model = model;
        this.isColor = isColor;
        this.type = type;
        this.isDuplex = isDuplex;
        this.tonerLevelBlack = tonerLevelBlack;
        this.tonerLeveMagenta = tonerLeveMagenta;
        this.tonerLeveYellow = tonerLeveYellow;
        this.tonerLeveBlue = tonerLeveBlue;
        this.printedPages = printedPages;
    }

    public void fillUp() {
        this.tonerLevelBlack = 100;
        this.tonerLeveMagenta = 100;
        this.tonerLeveBlue = 100;
        this.tonerLeveYellow = 100;
    }

    public  void printPage(int printedPages) {

        for (int i = 1; i <= printedPages; i++) {
            if (tonerLevelBlack < 8 || tonerLeveBlue < 8 || tonerLeveMagenta < 8 || tonerLeveYellow <= 8) {
                System.out.println("Toner is empty");

                break;
            }
            //  уменьшаю краску в принтере после печати
            tonerLeveYellow = tonerLeveYellow - 8;
            tonerLeveMagenta = tonerLeveMagenta - 8;
            tonerLeveBlue = tonerLeveBlue - 8;
            tonerLevelBlack = tonerLevelBlack - 9;

            System.out.println("Page printed " + i);

        }


    }


}
