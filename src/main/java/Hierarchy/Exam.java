package Hierarchy;

import java.io.Serializable;
import java.util.Random;

public class Exam extends Trial implements Serializable {

    char mark; // A - 5  B - 4  C - 3  D - 3  E - 2 F - 2
    static Random rnd = new Random();

    public Exam()
    {
        super();
        this.mark ='F';
    }
    public Exam(String name, char mark)
    {
        super(name);
        this.mark = mark;
    }
    public String GetMark()
    {
        return String.valueOf(this.mark);
    }

    public void SetMark(char mark)
    {
        try {
            if (mark == 'A' || mark == 'B' || mark == 'C' || mark == 'D' || mark =='E' || mark == 'F') {
                this.mark = mark;
            }
            else{
                throw new Exception("Оценка должна входить в диапазон A - F");
            }
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }
    }

    public void RandomInit()
    {
        super.RandomInit();
        char[] marks = { 'A', 'B', 'C', 'D', 'E', 'F' };
        this.mark = marks[rnd.nextInt(0, marks.length)];
    }

    @Override
    public String toString() {
        return super.toString()+" "+mark;
    }
}
