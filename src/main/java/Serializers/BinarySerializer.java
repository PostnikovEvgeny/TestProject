package Serializers;

import Interfaces.ISerialize;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;

public class BinarySerializer<T> implements ISerialize<T> {

    public void SerializeTo(Collection<T> collection) {
        try (ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream("D://BinaryCollection.dat"))) {
            stream.writeObject(collection);
            System.out.println("Файл успешно сохранен");
        } catch (Exception ex) {

            System.out.println(ex.getMessage());
        }
    }
}

