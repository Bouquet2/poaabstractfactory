package fr.paris10.poa.td4.filesystem;

/**
 * Created by vabouque on 17/10/2016.
 */
public interface AbstractFileFactory {

    AbstractFile createAbstractFile(String fileName);

    AbstractFile createAbstractFile(String fileName, String directoryParentName);

    AbstractFile createDirectory(String directoryName, String directoryParentName);

    AbstractFile createDirectory(String directoryName);

    String readFile(String fileName);

    void writeInFile(String fileName, String message);

    void deleteFile(String fileName);


}
