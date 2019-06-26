package ru.drakonov;

import java.net.InetAddress;
import java.net.UnknownHostException;


public class ComputerName {

    public static String getHostname() {
        String hostname;
        InetAddress addr;
        try {
            addr = InetAddress.getLocalHost();
            hostname = addr.getHostName();
        } catch (UnknownHostException e) {
            hostname = "Hostname can not be resolved";
        }
        return hostname;
    }


}


