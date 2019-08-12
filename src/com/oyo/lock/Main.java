package com.oyo.lock;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Arrays;

/**
 * @author liurui
 * @time 2019-08-09 18:14
 */
public class Main {
    public static void main(String[] args) throws IOException {
    /*    InetAddress localHost = InetAddress.getLocalHost();
        System.out.println("localHost:" + localHost);
        System.out.println("localHost.getHostName:" + localHost.getHostName());
        System.out.println("localHost.getHostAddress:" + localHost.getHostAddress());
        byte[] address = localHost.getAddress();
        System.out.println(Arrays.toString(address));

        System.out.println("=============================================");


        InetAddress address1 = InetAddress.getByName("OYO2946.local");
        System.out.println(address1.getHostName());
        System.out.println(address1.getHostAddress());*/

        try {
            add();
        } catch (Exception e) {

        }

    }

    public static int add() throws Exception {
        int a = 0;
        int b = 2;

        int result = 0;

        try {
            result = b / a;
            return result;

        } catch (Exception e) {
            throw new Exception();

        }
    }

}
