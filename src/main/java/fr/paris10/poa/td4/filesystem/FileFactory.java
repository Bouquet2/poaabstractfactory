package fr.paris10.poa.td4.filesystem;

/**
 * Created by vabouque on 17/10/2016.
 */
public class FileFactory {
    static AbstractFileFactory instance = null;

    public static AbstractFileFactory getFactory() throws Exception {
        if (instance != null) {
            return instance;
        }
        String osName = System.getProperty("os.name");
        if (osName.equals(SystemENUM.Linux.toString())) {
            instance = new LinuxFactory();
        } else if (osName.equals(SystemENUM.Windows.toString())) {
            instance = new WinFactory();
        } else {
            throw new Exception("Unknown os version");
        }
        return instance;
    }

    public static AbstractFileFactory getFactory(String osName) throws Exception {
        if (instance != null) {
            return instance;
        }
        if (osName.equals(SystemENUM.Linux.toString())) {
            instance = new LinuxFactory();
        } else if (osName.equals(SystemENUM.Windows.toString())) {
            instance = new WinFactory();
        } else {
            throw new Exception("Unknown os version");
        }
        return instance;
    }
}
