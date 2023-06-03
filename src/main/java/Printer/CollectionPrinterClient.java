package Printer;

import Interfaces.ICollectionPrinter;

import java.util.Collection;

public class CollectionPrinterClient<T> implements ICollectionPrinter<T> {
    ICollectionPrinter<T> collectionPrinter;

    public CollectionPrinterClient(ICollectionPrinter<T> printer)
    {
        collectionPrinter = printer;
    }
    public void PrintCollection(Collection<T> collection) {
        this.collectionPrinter.PrintCollection(collection);
    }
}
