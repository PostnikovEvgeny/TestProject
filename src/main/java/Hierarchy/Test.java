package Hierarchy;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import java.io.Serializable;
import java.util.Random;


//@JsonTypeName("test")
@JsonAutoDetect
public class Test extends Trial implements Serializable {

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

    public String getScore()
    {
        return Integer.toString(this.score);
    }
    public void setScore(int score)
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

    @Override
    public String toString() {
        return super.toString()+" "+getScore();
    }
}
