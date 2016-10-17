package fr.paris10.poa.td4.filesystem;

/**
 * Created by vabouque on 17/10/2016.
 */
public class LinuxOrdinaryFile implements AbstractOrdinaryFile {

    public LinuxOrdinaryFile() {
    }

    @Override
    //TODO open
    public void open() {

    }

    @Override
    //TODO write
    public void write() {

    }

    @Override
    //TODO read
    public void read() {

    }

    @Override
    //TODO getFileName
    public String getFileName() {
        return fileName;
    }

    @Override
    //TODO setFileName
    public String setFileName() {
        return null;
    }

    @Override
    public Boolean isLinux() {
        return true;
    }

    @Override
    public Boolean isWindows() {
        return false;
    }
}
