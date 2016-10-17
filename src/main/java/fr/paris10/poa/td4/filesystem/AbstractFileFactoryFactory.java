package fr.paris10.poa.td4.filesystem;

/**
 * Created by vabouque on 17/10/2016.
 */
public interface AbstractFileFactoryFactory {
    //TODO Factory de factory pour créer la bonne factory selon l'os
    /*
    public static AbstractFileFactory getFactory() throws Exception{
        String osName = System.getProperty("os.name");
        if(osName.equals(SystemENUM.Linux.toString())) {
            return new LinuxFactory();
        }
        else if(osName.equals(SystemENUM.Windows.toString())) {
            return new WinFactory();
        } else {
            throw new Exception("Unknown os version");
        }
    }*/
}
