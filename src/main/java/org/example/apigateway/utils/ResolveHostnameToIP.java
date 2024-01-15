package org.example.apigateway.utils;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class ResolveHostnameToIP {

    public static String resolve(String hostname) {
        try {
            InetAddress address = InetAddress.getByName(hostname);
            return address.getHostAddress();
        } catch (UnknownHostException e) {
            return "127.0.0.1";
        }
    }
}
