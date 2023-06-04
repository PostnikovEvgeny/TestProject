package Serializers;

import Interfaces.ISerialize;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;

public class XMLSerializer<T> implements ISerialize<T> {
    @Override
    public void SerializeTo(Collection<T> collection) {
        try(FileWriter writer = new FileWriter("D://XMLCollection.xml"))
        {
            writer.toString();
            XmlMapper mapper = new XmlMapper();
            mapper.enable(SerializationFeature.INDENT_OUTPUT);
            // mapper.enableDefaultTyping();

            mapper.writeValue(writer, collection);
            //mapper.enable(SerializationFeature.INDENT_OUTPUT);
            //gson.toJson(collection,writer);
            System.out.println("Файл успешно сохранен");
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}
