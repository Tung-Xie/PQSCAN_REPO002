from Crypto.Cipher import AES, DES, DES3, ARC4, Blowfish, CAST, ChaCha20

def symmetric_ciphers():
    # Critical: 淘汰類
    des = DES.new(b'8bytekey', DES.MODE_ECB)
    des3 = DES3.new(b'16bytekeyfor3des', DES3.MODE_CBC)
    rc4 = ARC4.new(b'secret_key')
    blowfish = Blowfish.new(b'bf_key', Blowfish.MODE_CBC)
    
    # Medium: 現代標準 (非 PQC)
    aes_128 = AES.new(b'16bytekeyaes128', AES.MODE_GCM)
    chacha = ChaCha20.new(key=b'32bytekeyforchacha20isrequired!')
