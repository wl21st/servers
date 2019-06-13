package com.sf.platform.security.ssl;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class HttpsGet {

    public static void main(String[] args) {

        String httpsUrl = "https://www.google.com";
//        String httpsUrl = "https://www.amazon.com";

        try {
            URL url = new java.net.URL(httpsUrl);
            URLConnection rc = url.openConnection();

            try (BufferedReader in = new BufferedReader(new InputStreamReader(rc.getInputStream()))) {
                String inputLine;
                while ((inputLine = in.readLine()) != null) {
                    System.out.println(inputLine);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}