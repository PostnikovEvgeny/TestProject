package Printer;

import Interfaces.ICollectionPrinter;

import java.util.Collection;

public class ConsoleCollectionPrinter<T> implements ICollectionPrinter<T> {
    public void PrintCollection(Collection<T> list)
    {
        if(list.isEmpty())
        {
            System.out.println("Пусто");
        }
        else {
            for (T item : list) {
                System.out.println(item);
            }
        }
    }
}
