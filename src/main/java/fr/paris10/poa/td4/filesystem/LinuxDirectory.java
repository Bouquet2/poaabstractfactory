package fr.paris10.poa.td4.filesystem;

/**
 * Created by vabouque on 24/10/2016.
 */
public class LinuxDirectory extends Directory {
    static String root = "/";

    LinuxDirectory(String name, String username) {
        super(name, username);
    }
}
