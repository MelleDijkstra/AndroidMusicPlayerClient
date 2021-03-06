package nl.melledijkstra.musicplayerclient.config;

/**
 * <p>Created by Melle Dijkstra on 17-4-2016</p>
 * <p>This class specifies all preference keys that can be used
 * in the application to store and get from the right place</p>
 */
public class PreferenceKeys {

    // Private constructor because its a static class
    private PreferenceKeys() {}

    /**
     * The remote ip connection to be used for socket connection
     */
    public static final String HOST_IP = "host_ip";

    /**
     * The port of the server
     */
    public static final String HOST_PORT = "host_port";

    /**
     * Debug state. If true then remote connection is simulated.
     */
    public static final String DEBUG = "debug";

}
