package fr.paris10.poa.td4.filesystem;

/**
 * Created by vabouque on 17/10/2016.
 */
public interface AbstractFile {

    String fileName = null;

    void open();

    void write();

    void read();

    String getFileName();

    String setFileName();

    Boolean isLinux();

    Boolean isWindows();
}
