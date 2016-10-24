package fr.paris10.poa.td4.filesystem;

/**
 * Created by vabouque on 24/10/2016.
 */
public class LinuxFactory implements AbstractFileFactory {

    LinuxFactory() {
    }

    @Override
    public File createFile(String fileName, String userName) {
        return new LinuxOrdinaryFile(fileName, userName);
    }

    @Override
    public File createDirectory(String directoryName, String userName) {
        return new LinuxDirectory(directoryName, userName);
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

    @Override
    public String getName(File file) {
        return file.getName();
    }

    @Override
    public int getId(File file) {
        return file.getId();
    }

    @Override
    public int size(File file) {
        return file.size();
    }

    @Override
    public UserRegistry.User getUser(File file) {
        return file.getUser();
    }

    @Override
    public File.OpenMode getMode(File file) {
        return file.getMode();
    }

    @Override
    public boolean write(File directory, File file) {
        return directory.write(file);
    }
}
