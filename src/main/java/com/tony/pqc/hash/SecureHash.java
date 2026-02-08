package com.tony.pqc.hash;
import java.security.MessageDigest;

public class SecureHash {
    public void generateDigest() throws Exception {
        // 使用 SHA-3 或 SHAKE256 (抗量子電腦搜尋攻擊效果較佳)
        MessageDigest sha3 = MessageDigest.getInstance("SHA3-256");
        MessageDigest shake = MessageDigest.getInstance("SHAKE256");
        System.out.println("SHA3-256 and SHAKE256 ready.");
    }
}
