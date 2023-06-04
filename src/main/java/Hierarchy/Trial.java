package Hierarchy;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;
import java.util.Random;


//@JsonAutoDetect
/*@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property="type")
@JsonSubTypes({
        @JsonSubTypes.Type(value=Test.class, name="test"),
        @JsonSubTypes.Type(value=Exam.class, name="exam")
})*/
/*@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property="type")
@JsonSubTypes({ @JsonSubTypes.Type(value = Test.class, name = "test"),
        @JsonSubTypes.Type(value = Exam.class, name = "exam") })*/
@JsonAutoDetect
public class Trial implements Serializable
{

    private String name;
    static Random rnd = new Random();
    public Trial()
    {
        this.name = "Математика";
    }
    public Trial(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return this.name;
    }
    public void setName(String name)
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

        return getName().toString();
    }
}
