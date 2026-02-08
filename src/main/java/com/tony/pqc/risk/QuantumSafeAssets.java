package com.tony.pqc.risk;
import java.security.*;
import javax.crypto.*;
import org.bouncycastle.pqc.jcajce.spec.*;

public class QuantumSafeAssets {
    public void callPQC() throws Exception {
        // --- KEX / KEM (Key Encapsulation) ---
        // NIST Standard (Crystals-Kyber)
        KeyPairGenerator.getInstance("ML-KEM", "BCPQC");
        
        // Code-based & Lattice-based Candidates
        KeyPairGenerator.getInstance("BIKE", "BCPQC");
        KeyPairGenerator.getInstance("HQC", "BCPQC");
        KeyPairGenerator.getInstance("FrodoKEM", "BCPQC");
        KeyPairGenerator.getInstance("Classic-McEliece", "BCPQC");
        KeyPairGenerator.getInstance("NTRU", "BCPQC");
        KeyPairGenerator.getInstance("NTRULPRime", "BCPQC");

        // --- PKI / Digital Signatures ---
        // NIST Standard (Crystals-Dilithium & Sphincs+)
        Signature.getInstance("ML-DSA", "BCPQC");
        Signature.getInstance("SLH-DSA", "BCPQC");
        
        // Multivariate & Additional Candidates
        Signature.getInstance("CROSS", "BCPQC");
        Signature.getInstance("MAYO", "BCPQC");
        Signature.getInstance("SNOVA", "BCPQC");
        Signature.getInstance("UOV", "BCPQC");

        // --- Cipher Suite (Quantum-Resistant Length) ---
        // AES-256 is quantum-safe against Grover's algorithm
        KeyGenerator aes256 = KeyGenerator.getInstance("AES");
        aes256.init(256); 
        
        // --- Secure Hash (Post-Quantum Hash Standards) ---
        // SHA-2 Family (Longer lengths)
        MessageDigest.getInstance("SHA-256");
        MessageDigest.getInstance("SHA-384");
        MessageDigest.getInstance("SHA-512");
        
        // SHA-3 Family (NIST Standard)
        MessageDigest.getInstance("SHA3-256");
        MessageDigest.getInstance("SHA3-384");
        MessageDigest.getInstance("SHA3-512");
        
        // SHAKE Variable-output Functions
        MessageDigest.getInstance("SHAKE128");
        MessageDigest.getInstance("SHAKE256");
    }
}
