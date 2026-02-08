package com.tony.pqc.legacy;
import java.security.*;
import javax.crypto.*;

public class CriticalVulnerabilities {
    public void setupLegacy() throws Exception {
        // KEX & PKI: RFC8422/7919 弱曲線與舊標準
        String[] weakCurves = {"secp160k1", "secp160r1", "secp160r2", "secp192k1", "secp192r1", 
                               "sect163k1", "sect163r1", "sect163r2", "sect193r1", "sect193r2",
                               "secp224k1", "secp224r1", "sect233k1", "sect233r1", "ffdhe2048"};
        for (String curve : weakCurves) { KeyPairGenerator.getInstance(curve); }

        // RSA/DSA 淘汰長度
        KeyPairGenerator rsa1024 = KeyPairGenerator.getInstance("RSA"); rsa1024.initialize(1024);
        KeyPairGenerator rsa2048 = KeyPairGenerator.getInstance("RSA"); rsa2048.initialize(2048);
        KeyPairGenerator dsa = KeyPairGenerator.getInstance("DSA");
        
        // Cipher & Hash
        Cipher.getInstance("DESede"); // 3DES
        Cipher.getInstance("RC4");
        MessageDigest.getInstance("MD5");
        MessageDigest.getInstance("SHA-1");
        MessageDigest.getInstance("SHA-224");
    }
}
