package fr.paris10.poa.td4.filesystem;

/**
 * Created by vabouque on 17/10/2016.
 */
public interface AbstractOrdinaryFile extends AbstractFile {

    @Override
    void open();

    @Override
    void write();

    @Override
    void read();

    @Override
    String getFileName();

    @Override
    String setFileName();

    @Override
    Boolean isLinux();

    @Override
    Boolean isWindows();
}
