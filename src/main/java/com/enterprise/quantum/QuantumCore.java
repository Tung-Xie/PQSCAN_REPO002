package com.enterprise.quantum;
public class QuantumCore {
    public void init() {
        String kem = "ML-KEM-768"; // Kyber
        String dsa = "ML-DSA-65";  // Dilithium
        System.out.println("Quantum Core Active: " + kem + " & " + dsa);
    }
}
