package Hierarchy;

import java.util.Random;

public class Trial
{
    protected String name;
    static Random rnd = new Random();
    public Trial()
    {
        this.name = "Математика";
    }
    public Trial(String name)
    {
        this.name = name;
    }
    public String GetName()
    {
        return this.name;
    }
    public void SetName(String name)
    {
        this.name = name;
    }
    public void RandomInit()
    {
        String[] namesOfSubjects = {"Математика","Русский язык","Информатика","Социология","Химия","Биология","Физика","Физкультура","ОБЖ","МХК","География","Английский язык"};
        this.name = namesOfSubjects[rnd.nextInt(0, namesOfSubjects.length)];
    }

    @Override
    public String toString() {
        return (name).toString();
    }
}
