package com.tony.pqc.risk;
import java.security.*;
import javax.crypto.*;

public class QuantumSafeAssets {
    public void callPQC() throws Exception {
        // PQC KEX (BouncyCastle PQC Provider 語法)
        KeyPairGenerator.getInstance("ML-KEM", "BCPQC");
        KeyPairGenerator.getInstance("BIKE", "BCPQC");
        KeyPairGenerator.getInstance("HQC", "BCPQC");
        KeyPairGenerator.getInstance("Frodo", "BCPQC");
        KeyPairGenerator.getInstance("McEliece", "BCPQC");
        KeyPairGenerator.getInstance("NTRU", "BCPQC");
        KeyPairGenerator.getInstance("NTRULPRime", "BCPQC");

        // PQC Signatures
        Signature.getInstance("ML-DSA", "BCPQC");
        Signature.getInstance("SLH-DSA", "BCPQC");
        Signature.getInstance("MAYO", "BCPQC");
        Signature.getInstance("SNOVA", "BCPQC");
        Signature.getInstance("UOV", "BCPQC");

        // 抗量子對稱加密與雜湊
        KeyGenerator aes256 = KeyGenerator.getInstance("AES"); aes256.init(256);
        MessageDigest.getInstance("SHA-512");
        MessageDigest.getInstance("SHA3-256");
        MessageDigest.getInstance("SHA3-384");
        MessageDigest.getInstance("SHA3-512");
    }
}
