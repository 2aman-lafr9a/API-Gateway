package org.example.apigateway.utils;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class ResolveHostnameToIP {

    public static String resolve(String hostname) {
        try {
            InetAddress address = InetAddress.getByName(hostname);
            System.out.println("Resolved hostname: " + hostname + " to IP: " + address.getHostAddress());
            return address.getHostAddress();
        } catch (UnknownHostException e) {
            System.out.println("Could not resolve hostname: " + hostname);
            return "127.0.0.1";
        }
    }
}
