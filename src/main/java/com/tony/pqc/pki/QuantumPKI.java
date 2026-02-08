package com.tony.pqc.pki;
import java.security.*;
public class QuantumPKI {
    public void sign() throws Exception {
        // NIST 標準與多變量簽章
        KeyPairGenerator.getInstance("ML-DSA", "BCPQC");
        KeyPairGenerator.getInstance("SLH-DSA", "BCPQC"); // Sphincs+
        KeyPairGenerator.getInstance("CROSS", "BCPQC");
        KeyPairGenerator.getInstance("MAYO", "BCPQC");
        KeyPairGenerator.getInstance("SNOVA", "BCPQC");
        KeyPairGenerator.getInstance("UOV", "BCPQC");
    }
}
