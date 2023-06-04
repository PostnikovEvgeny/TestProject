package Serializers;

import Interfaces.ISerialize;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;


import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;

public class JSONSerializer<T> implements ISerialize<T> {

    public void SerializeTo(Collection<T> collection) {
       // Gson gson = new Gson();
        try(FileWriter writer = new FileWriter("D://JSONCollection.json"))
        {
            writer.toString();
            ObjectMapper mapper = new ObjectMapper();
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
