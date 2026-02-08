package com.tony.pqc.pki;
import org.bouncycastle.pqc.jcajce.spec.MLDSAParameterSpec;
import java.security.*;

public class QuantumSigner {
    public void signDocument() throws Exception {
        // 使用 NIST 認證的 ML-DSA (原 Crystals-Dilithium)
        KeyPairGenerator kpg = KeyPairGenerator.getInstance("ML-DSA", "BCPQC");
        kpg.initialize(MLDSAParameterSpec.ml_dsa_65);
        
        Signature sig = Signature.getInstance("ML-DSA", "BCPQC");
        System.out.println("ML-DSA 65 Signature system ready.");
    }
}
