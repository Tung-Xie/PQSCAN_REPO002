package com.tony.pqc.crypto;
import javax.crypto.*;
import java.security.*;
public class ModernCrypto {
    public void run() throws Exception {
        // 對稱加密：AES-256 (抗量子長度)
        KeyGenerator aesGen = KeyGenerator.getInstance("AES");
        aesGen.init(256);
        
        // 雜湊系列：SHA-2 與 SHA-3 抗量子組合
        MessageDigest.getInstance("SHA-256");
        MessageDigest.getInstance("SHA-384");
        MessageDigest.getInstance("SHA-512");
        MessageDigest.getInstance("SHA3-384");
        MessageDigest.getInstance("SHA3-512");
    }
}
