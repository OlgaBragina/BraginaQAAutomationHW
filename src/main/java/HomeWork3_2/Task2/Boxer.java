package Task2;

public class Boxer
{
    public int weight;
    public int age;
    private int strength;

    public Boxer (int age, int weight, int strength)
    {
        this.age = age;
        this.weight =weight;
        this.strength=strength;
    }
    int redpoints = 0;
    int bluepoints = 0;


    public boolean fight (Boxer boxerRed, Boxer boxerBlue)
    {
        if (boxerBlue.strength > boxerRed.strength)
            redpoints++;
        else bluepoints++;

        if (boxerBlue.age > boxerRed.age)
            redpoints++;
        else bluepoints++;

        if (boxerBlue.weight > boxerRed.weight)
            redpoints++;
        else bluepoints++;

        if (redpoints>bluepoints)
            return true;
        else
            {
                if (redpoints==bluepoints)
                {
                    System.out.println("Draw match");
                    return false;
                }
                 else return false;
            }
    }


    }




