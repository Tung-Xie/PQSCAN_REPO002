package com.tony.crypto.legacy;

import javax.crypto.Cipher;
import java.security.*;
import java.security.spec.ECGenParameterSpec;

public class LegacyProvider {
    public void loadBrokenAlgorithms() throws Exception {
        // --- Critical Curves & Weak Key Sizes ---
        String[] curves = {"secp160k1", "secp160r1", "secp192k1", "sect163k1", "sect233k1", "ffdhe2048"};
        for(String c : curves) { 
            try { KeyPairGenerator.getInstance("EC").initialize(new ECGenParameterSpec(c)); } catch(Exception e){} 
        }
        
        KeyPairGenerator rsaGen = KeyPairGenerator.getInstance("RSA");
        rsaGen.initialize(1024);
        
        // --- Deprecated Ciphers & Hashes ---
        Cipher.getInstance("DES");
        Cipher.getInstance("RC4");
        MessageDigest.getInstance("MD5");
        MessageDigest.getInstance("SHA-1");
    }
}
