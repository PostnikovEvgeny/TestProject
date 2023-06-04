package Deserializers;

import Hierarchy.Exam;
import Hierarchy.Test;
import Hierarchy.Trial;
import Interfaces.IDeserialize;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class JSONDeserializer<T> implements IDeserialize<T> {


    @Override
    public Collection<T> DeserializeFrom(String filepath) {

        ArrayList<T> newList;
        try(FileReader reader = new FileReader(filepath))
        {
            ObjectMapper mapper = new ObjectMapper();
            newList = mapper.readValue(reader, new TypeReference<ArrayList<T>>(){});
            return newList;
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
        return null;
    }
}


