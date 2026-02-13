package com.tony.crypto.modern;

import javax.crypto.KeyGenerator;
import java.security.MessageDigest;

public class ModernStandard {
    public void secureOperations() throws Exception {
        // AES-256 (Quantum-Safe length)
        KeyGenerator aes256 = KeyGenerator.getInstance("AES");
        aes256.init(256); 
        
        // SHA-3 & SHAKE Family
        MessageDigest.getInstance("SHA3-256");
        MessageDigest.getInstance("SHA3-512");
        MessageDigest.getInstance("SHAKE128");
        MessageDigest.getInstance("SHAKE256");
    }
}
