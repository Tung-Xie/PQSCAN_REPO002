package com.tony.pqc.kex;
import java.security.*;
public class QuantumKEX {
    public void init() throws Exception {
        // NIST 標竿與各類候選算法
        KeyPairGenerator.getInstance("ML-KEM", "BCPQC");
        KeyPairGenerator.getInstance("BIKE", "BCPQC");
        KeyPairGenerator.getInstance("HQC", "BCPQC");
        KeyPairGenerator.getInstance("Frodo", "BCPQC");
        KeyPairGenerator.getInstance("NTRU", "BCPQC");
        KeyPairGenerator.getInstance("NTRULPRime", "BCPQC");
        KeyPairGenerator.getInstance("McEliece", "BCPQC");
    }
}
