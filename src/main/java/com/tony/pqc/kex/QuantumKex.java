package com.tony.pqc.kex;
import org.bouncycastle.pqc.jcajce.spec.MLKEMParameterSpec;
import java.security.*;

public class QuantumKex {
    public void establishSecureChannel() throws Exception {
        // 使用 NIST 認證的 ML-KEM (原 Crystals-Kyber)
        KeyPairGenerator kpg = KeyPairGenerator.getInstance("ML-KEM", "BCPQC");
        kpg.initialize(MLKEMParameterSpec.ml_kem_768); 
        KeyPair kp = kpg.generateKeyPair();
        System.out.println("ML-KEM 768 Key Exchange initialized.");
    }
}
