package no.hiof.paulai.oblig4.interfaces;

import java.util.ArrayList;

public interface ObjectFileHandler<T>{
    void writeObjectsToFile(ArrayList<T> list, String filename);
    ArrayList<T> readObjectFromFile(String filepath);
}
