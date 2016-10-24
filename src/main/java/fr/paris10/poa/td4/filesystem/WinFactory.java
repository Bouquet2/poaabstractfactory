package fr.paris10.poa.td4.filesystem;

/**
 * Created by vabouque on 24/10/2016.
 */
public class WinFactory implements AbstractFileFactory {

    @Override
    public File createFile(String fileName, String userName) {
        return new WinOrdinaryFile(fileName, userName);
    }

    @Override
    public File createDirectory(String directoryName, String userName) {
        return new WinDirectory(directoryName, userName);
    }

    @Override
    public boolean open(File file, File.OpenMode mode) {
        return file.open(mode);
    }

    @Override
    public boolean close(File file) {
        return file.close();
    }

    @Override
    public void rename(File file, String fileName) {
        file.rename(fileName);
    }

    @Override
    public String read(File file) {
        return file.read();
    }

    @Override
    public boolean write(File file, String content) {
        return file.write(content);
    }
}
