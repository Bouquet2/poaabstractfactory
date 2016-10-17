package fr.paris10.poa.td4.filesystem;

import java.util.HashMap;

/**
 * Created by vabouque on 17/10/2016.
 */
public interface AbstractDirectory extends AbstractFile {

    HashMap<String, AbstractFile> files = null;

    @Override
    public void open();

    @Override
    public void write();

    @Override
    public void read();

    @Override
    public String getFileName();

    @Override
    public String setFileName();

    @Override
    Boolean isLinux();

    @Override
    Boolean isWindows();
}
