package com.tony.pqc.risk;
import java.security.*;
import javax.crypto.*;

public class MediumAssets {
    public void callModern() throws Exception {
        // KEX: ECDH P-256/384, X25519
        KeyPairGenerator.getInstance("secp256r1");
        KeyPairGenerator.getInstance("X25519");
        KeyPairGenerator.getInstance("X448");
        KeyPairGenerator.getInstance("brainpoolP256r1");

        // PKI: RSA-3072, ECDSA
        KeyPairGenerator rsa3 = KeyPairGenerator.getInstance("RSA"); rsa3.initialize(3072);
        Signature.getInstance("SHA256withECDSA");
        Signature.getInstance("Ed25519");
        Signature.getInstance("SHA256withRSA/PSS");

        // Cipher & Hash
        Cipher.getInstance("AES/GCM/NoPadding"); // AES-128
        Cipher.getInstance("ChaCha20");
        MessageDigest.getInstance("SHA-256");
        MessageDigest.getInstance("SHA-384");
    }
}
