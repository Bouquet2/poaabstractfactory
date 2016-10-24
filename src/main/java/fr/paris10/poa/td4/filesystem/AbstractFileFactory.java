package fr.paris10.poa.td4.filesystem;

/**
 * Created by vabouque on 17/10/2016.
 */
public interface AbstractFileFactory {

    File createFile(String fileName, String userName);

    File createDirectory(String directoryName, String userName);

    boolean open(File file, File.OpenMode mode);

    boolean close(File file);

    void rename(File file, String fileName);

    String read(File file);

    boolean write(File file, String content);

    boolean write(File directory, File file);

    String getName(File file);

    int getId(File file);

    int size(File file);

    UserRegistry.User getUser(File file);

    File.OpenMode getMode(File file);
}
