package Deserializers;

import Hierarchy.Trial;
import Interfaces.IDeserialize;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collection;

public class BinaryDeserializer<T> implements IDeserialize<T> {

    public Collection<T> DeserializeFrom(String filepath) {

        ArrayList<T> newList= new ArrayList<>();
        try(ObjectInputStream stream = new ObjectInputStream(new FileInputStream(filepath)))
        {
            newList=((ArrayList<T>)stream.readObject());
            System.out.println("Файл успешно восстановлен");
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }
        return newList;

    }
}
