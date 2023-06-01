package Hierarchy;

import java.util.Random;

public class Test extends Trial {

    private int score;
    static Random rnd = new Random();
    public Test()
    {
        super();
        this.score = 0;
    }

    public Test(String name, int score)
    {
        super(name);
        this.score = score;
    }

    public String GetScore()
    {
        return Integer.toString(this.score);
    }
    public void SetScore(int score)
    {
        try {
            if (score >= 0 || score <= 100) {
                this.score = score;
            }
            else{
                throw new Exception("Число должно входить в диапазон 0-100");
            }
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }

    }
    public void RandomInit()
    {
        super.RandomInit();
        this.score = rnd.nextInt(0,101);
    }


}
