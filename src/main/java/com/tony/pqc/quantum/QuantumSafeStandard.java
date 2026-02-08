package com.tony.pqc.quantum;
import java.security.*;
import javax.crypto.*;

public class QuantumSafeStandard {
    public void setupPQC() throws Exception {
        // PQC KEX
        String[] pqcKex = {"ML-KEM", "BIKE", "Classic-McEliece", "FrodoKEM", "HQC", "NTRU", "NTRUPrime"};
        for (String pq : pqcKex) { KeyPairGenerator.getInstance(pq, "BCPQC"); }

        // PQC Signatures
        String[] pqcSig = {"ML-DSA", "SLH-DSA", "CROSS", "MAYO", "SNOVA", "UOV"};
        for (String ps : pqcSig) { Signature.getInstance(ps, "BCPQC"); }

        // 抗量子對稱加密與雜湊
        KeyGenerator aes256 = KeyGenerator.getInstance("AES"); aes256.init(256);
        MessageDigest.getInstance("SHA3-256");
        MessageDigest.getInstance("SHA3-512");
        MessageDigest.getInstance("SHA-512");
    }
}
