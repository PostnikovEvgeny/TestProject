package Interfaces;

import Hierarchy.Trial;

import java.util.Collection;

public interface IDeserialize<T> {
    public Collection<T> DeserializeFrom(String filepath);
}
