package com.tony.pqc.cipher;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.KeyGenerator;
import java.security.SecureRandom;

public class ModernEncryption {
    public void secureStorage() throws Exception {
        // 使用 AES-256 GCM 模式 (目前最安全的對稱加密標準)
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        keyGen.init(256);
        System.out.println("AES-256-GCM initialized for high-performance encryption.");
    }
}
