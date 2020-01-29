package ie.tudublin;

public class Cat extends Animal
{
    public int numLives = 9;

    public void setNumLives(int lives)
    {
        this.numLives = lives;
    }
    public int getNumLives()
    {
        return numLives;
    }

    public void killed()
    {
        numLives = numLives -1;

        if (numLives > 0)
        {
            System.out.println("Ouch!");
        }

        if (numLives == 0)
        {
            System.Out.Println("dead");
        }

    }

    public void speak()
    {
        System.out.println("Meow!");
    }
}