package Deserializers;

import Interfaces.IDeserialize;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

public class XMLDeserializer<T> implements IDeserialize<T> {
    @Override
    public Collection<T> DeserializeFrom(String filepath) {
        ArrayList<T> newList = new ArrayList<>();
        try(FileReader reader = new FileReader(filepath))
        {
            XmlMapper mapper = new XmlMapper();

            newList = mapper.readValue(reader, new TypeReference<>(){});

        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
        return newList;
    }
}
