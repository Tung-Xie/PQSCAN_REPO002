package com.tony.pqc.modern;
import java.security.*;
import javax.crypto.*;

public class ModernStandard {
    public void setupModern() throws Exception {
        // KEX & PKI: 現代 ECDH/ECDSA
        String[] modernCurves = {"secp256r1", "secp256k1", "X25519", "X448", "brainpoolP256r1", "secp384r1"};
        for (String c : modernCurves) { KeyPairGenerator.getInstance(c); }

        // RSA-3072 & PSS
        KeyPairGenerator rsa3072 = KeyPairGenerator.getInstance("RSA"); rsa3072.initialize(3072);
        Signature.getInstance("SHA256withRSA/PSS");
        
        // Cipher & Hash
        Cipher.getInstance("AES/GCM/NoPadding"); // AES-128
        Cipher.getInstance("ChaCha20");
        MessageDigest.getInstance("SHA-256");
        MessageDigest.getInstance("SHA-384");
    }
}
