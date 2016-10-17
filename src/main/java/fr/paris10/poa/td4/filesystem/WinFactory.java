package fr.paris10.poa.td4.filesystem;

import java.util.HashMap;

/**
 * Created by vabouque on 17/10/2016.
 */
public class WinFactory implements AbstractFileFactory {
    static AbstractFileFactory instance;
    private final String root = "C:/";
    private HashMap<String, AbstractFile> fileTree;

    public WinFactory() {
        this.fileTree = new HashMap<String, AbstractFile>();
    }

    public AbstractFileFactory createFactory() {
        if (instance == null) {
            instance = new WinFactory();
        }
        return instance;
    }

    @Override
    //TODO createAbstractFile
    public AbstractFile createAbstractFile(String fileName) {
        return new WinOrdinaryFile(fileName);
    }

    @Override
    //TODO createAbstractFile
    public AbstractFile createAbstractFile(String fileName, String directoryParentName) {
        return null;
    }

    @Override
    //TODO createDirectory
    public AbstractFile createDirectory(String directoryName, String directoryParentName) {
        return null;
    }

    @Override
    //TODO createDirectory
    public AbstractFile createDirectory(String directoryName) {
        return null;
    }

    @Override
    //TODO readFile
    public String readFile(String fileName) {
        return null;
    }

    @Override
    //TODO writeInFile
    public void writeInFile(String fileName, String message) {

    }

    @Override
    //TODO deleteFile
    public void deleteFile(String fileName) {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WinFactory that = (WinFactory) o;

        if (root != null ? !root.equals(that.root) : that.root != null) return false;
        return fileTree != null ? fileTree.equals(that.fileTree) : that.fileTree == null;

    }

    @Override
    public int hashCode() {
        int result = root != null ? root.hashCode() : 0;
        result = 31 * result + (fileTree != null ? fileTree.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "WinFactory{" +
                "root='" + root + '\'' +
                ", fileTree=" + fileTree +
                '}';
    }
}
