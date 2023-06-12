package no.hiof.paulai.oblig4.tools;

import no.hiof.paulai.oblig4.interfaces.ObjectFileHandler;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import no.hiof.paulai.oblig4.model.Star;
import no.hiof.paulai.oblig4.interfaces.ObjectFileHandler;

import javax.imageio.IIOException;

public class StarCSVFileHandler implements ObjectFileHandler {
    @Override
    public void writeObjectsToFile(ArrayList list, String filename) {
    try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File(filename)))){
        for (Star star: (ArrayList<Star>)list) {
            bufferedWriter.write(star.getName() + ","+ star.getRadius() + "," + star.getMass() +"," + star.getEffectiveTemp() + "\n");
        }
    }
    catch (IIOException e) {
        e.printStackTrace();
    }

    }
}
