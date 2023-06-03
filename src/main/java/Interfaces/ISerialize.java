package Interfaces;

import java.util.Collection;
import java.util.stream.Stream;

public interface ISerialize<T> {
    public void SerializeTo(Collection<T> collection);
}
