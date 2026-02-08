from Crypto.Cipher import AES, DES, ARC4

def encrypt_data():
    # 對稱加密：包含極度危險的 DES 與 RC4
    cipher_des = DES.new(b'8bytekey', DES.MODE_ECB)
    cipher_rc4 = ARC4.new(b'secretkey')
    # 現代但非 PQC 的 AES-128
    cipher_aes = AES.new(b'16bytekeyexactly', AES.MODE_CBC)
