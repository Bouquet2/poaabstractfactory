package fr.paris10.poa.td4.filesystem;

/**
 * Created by vabouque on 24/10/2016.
 */
public class WinDirectory extends Directory {
    static String root = "C:/";

    WinDirectory(String name, String username) {
        super(name, username);
    }
}
