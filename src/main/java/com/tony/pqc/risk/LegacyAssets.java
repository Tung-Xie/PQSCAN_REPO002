package com.tony.pqc.risk;
import java.security.*;
import javax.crypto.*;

public class LegacyAssets {
    public void callCritical() throws Exception {
        // Critical Curves (NIST SP800-57 Legacy)
        String[] curves = {"secp160k1", "secp160r1", "secp192k1", "sect163k1", "sect233k1", "ffdhe2048"};
        for(String c : curves) { try { KeyPairGenerator.getInstance(c); } catch(Exception e){} }
        
        KeyPairGenerator.getInstance("RSA").initialize(1024);
        Cipher.getInstance("DES");
        Cipher.getInstance("RC4");
        MessageDigest.getInstance("MD5");
        MessageDigest.getInstance("SHA-1");
    }
}
