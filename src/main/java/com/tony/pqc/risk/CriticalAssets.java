package com.tony.pqc.risk;
import java.security.*;
import javax.crypto.*;
import java.security.spec.*;

public class CriticalAssets {
    public void callLegacy() throws Exception {
        // KEX & PKI: 弱曲線
        KeyPairGenerator.getInstance("secp160k1");
        KeyPairGenerator.getInstance("secp160r1");
        KeyPairGenerator.getInstance("secp192k1");
        KeyPairGenerator.getInstance("secp224r1");
        KeyPairGenerator.getInstance("sect163k1");
        KeyPairGenerator.getInstance("sect233r1");
        KeyPairGenerator.getInstance("ffdhe2048");

        // PKI: 舊式 RSA/DSA
        KeyPairGenerator rsa1 = KeyPairGenerator.getInstance("RSA"); rsa1.initialize(1024);
        KeyPairGenerator rsa2 = KeyPairGenerator.getInstance("RSA"); rsa2.initialize(2048);
        KeyPairGenerator dsa = KeyPairGenerator.getInstance("DSA");
        Signature.getInstance("MD5withRSA");

        // Cipher & Hash
        Cipher.getInstance("DES/ECB/PKCS5Padding"); 
        Cipher.getInstance("DESede/CBC/PKCS5Padding"); // 3DES
        Cipher.getInstance("RC4");
        MessageDigest.getInstance("MD5");
        MessageDigest.getInstance("SHA-1");
        MessageDigest.getInstance("SHA-224");
    }
}
