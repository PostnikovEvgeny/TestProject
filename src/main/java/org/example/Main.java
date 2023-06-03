package org.example;

import Hierarchy.Test;
import Hierarchy.Trial;
import Hierarchy.Exam;
import Printer.ConsoleCollectionPrinter;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ConsoleCollectionPrinter<Trial> printer = new ConsoleCollectionPrinter<Trial>();
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
        ArrayList<Trial> list = new ArrayList<Trial>();
        list.add(new Trial());
        list.add(new Test());
        list.add(new Exam());
        printer.PrintCollection(list);

    }

}