package org.example;

import Deserializers.BinaryDeserializer;
import Deserializers.JSONDeserializer;
import Deserializers.XMLDeserializer;
import Hierarchy.Test;
import Hierarchy.Trial;
import Hierarchy.Exam;
import Printer.CollectionPrinterClient;
import Printer.ConsoleCollectionPrinter;
import Serializers.BinarySerializer;
import Serializers.JSONSerializer;
import Serializers.XMLSerializer;
import com.sun.source.doctree.TextTree;


import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        CollectionPrinterClient<Trial> printer = new CollectionPrinterClient<>(new ConsoleCollectionPrinter<Trial>());
        /*Trial t = new Trial("Trial");
        System.out.println(t.GetName());
        t.RandomInit();
        System.out.println(t.GetName());

        Test tst = new Test("Test",15);
        System.out.println(tst.GetName());
        System.out.println(tst.GetScore());
        tst.RandomInit();
        System.out.println(tst.GetName());
        System.out.println(tst.GetScore());

        Exam ex = new Exam("Exam",'A');
        System.out.println(ex.GetName());
        System.out.println(ex.GetMark());
        ex.RandomInit();
        System.out.println(ex.GetName());
        System.out.println(ex.GetMark());*/

        /*BinarySerializer<Trial> serializer = new BinarySerializer<>();
        BinaryDeserializer<Trial> deserializer = new BinaryDeserializer<>();
        JSONSerializer<Trial> jsnSerializer = new JSONSerializer<>();
        JSONDeserializer<Trial> jsnDeserializer = new JSONDeserializer<>();
        XMLSerializer<Trial> xmlSerializer = new XMLSerializer<>();
        XMLDeserializer<Trial> xmlDeserializer = new XMLDeserializer<>();
        ArrayList<Trial> list = new ArrayList<Trial>();
        list.add(new Trial());
        list.add(new Test());
        list.add(new Exam());

        System.out.println(list.getClass());
        printer.PrintCollection(list);
        serializer.SerializeTo(list);

        list.clear();

        printer.PrintCollection(list);
        list = (ArrayList<Trial>)deserializer.DeserializeFrom("D://BinaryCollection.dat");
        printer.PrintCollection(list);



        jsnSerializer.SerializeTo(list);
        list.clear();
        printer.PrintCollection(list);
        list = (ArrayList<Trial>)jsnDeserializer.DeserializeFrom("D://JSONCollection.json");
        printer.PrintCollection(list);


        System.out.println(list.getClass());

        xmlSerializer.SerializeTo(list);
        list.clear();
        printer.PrintCollection(list);
        list = (ArrayList<Trial>)xmlDeserializer.DeserializeFrom("D://XMLCollection.xml");
        printer.PrintCollection(list);*/
        Test t = new Test("Ин яз",88);
        System.out.println(t.toString());

    }

}