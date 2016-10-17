package fr.paris10.poa.td4.filesystem;

/**
 * Created by vabouque on 17/10/2016.
 */
public class WinOrdinaryFile implements AbstractOrdinaryFile {

    public WinOrdinaryFile(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void open() {

    }

    @Override
    public void write() {

    }

    @Override
    public void read() {

    }

    @Override
    public String getFileName() {
        return null;
    }

    @Override
    public String setFileName() {
        return null;
    }

    @Override
    public Boolean isLinux() {
        return false;
    }

    @Override
    public Boolean isWindows() {
        return true;
    }
}
