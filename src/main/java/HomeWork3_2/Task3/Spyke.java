package Task3;

public class Spyke {
    public static void main(String[] args) {
        Dog spyke = new Dog("Spyke", 2);
        String dogName = spyke.getName();
        int dogAge = spyke.getAge();

        System.out.println("Dog's name is " + dogName);
        System.out.println("Dog's age is " + dogAge);
    }
}
