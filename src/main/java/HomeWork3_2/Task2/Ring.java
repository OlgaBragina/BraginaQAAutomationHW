package Task2;

public class Ring
{
   static Boxer tayson = new Boxer(32, 110, 500);
   static Boxer ali = new Boxer(33,120,650);

    public static void main(String[] args) {


        System.out.println("Did Tayson Win? " + tayson.fight(tayson, ali));
    }

}
