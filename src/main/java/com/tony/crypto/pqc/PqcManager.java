package com.tony.crypto.pqc;

import java.security.*;

public class PqcManager {
    public void initPostQuantumSuite() throws Exception {
        // --- KEX / KEM (ML-KEM/Kyber, BIKE, HQC, NTRU) ---
        KeyPairGenerator.getInstance("ML-KEM", "BCPQC");
        KeyPairGenerator.getInstance("BIKE", "BCPQC");
        KeyPairGenerator.getInstance("HQC", "BCPQC");
        KeyPairGenerator.getInstance("FrodoKEM", "BCPQC");
        KeyPairGenerator.getInstance("Classic-McEliece", "BCPQC");
        KeyPairGenerator.getInstance("NTRU", "BCPQC");

        // --- PKI / Signatures (ML-DSA, SLH-DSA, MAYO, UOV) ---
        Signature.getInstance("ML-DSA", "BCPQC");
        Signature.getInstance("SLH-DSA", "BCPQC");
        Signature.getInstance("MAYO", "BCPQC");
        Signature.getInstance("SNOVA", "BCPQC");
        Signature.getInstance("UOV", "BCPQC");
    }
}
