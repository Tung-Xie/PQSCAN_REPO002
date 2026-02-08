from Crypto.Cipher import AES, CAST, Blowfish, DES

def encrypt_assets():
    aes_128_ecb = AES.new(b'16byteskeyaes128', AES.MODE_ECB)
    blowfish_cipher = Blowfish.new(b'blowfish_key_8', Blowfish.MODE_CBC)
    cast5_cipher = CAST.new(b'cast5_secret_key', CAST.MODE_OPENPGP)
    single_des = DES.new(b'8bytekey', DES.MODE_CFB)
