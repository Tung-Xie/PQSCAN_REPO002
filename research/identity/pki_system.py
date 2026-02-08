from cryptography.hazmat.primitives.asymmetric import rsa, dsa

def get_keys():
    # 現代但量子脆弱的 RSA
    rsa_key = rsa.generate_private_key(public_exponent=65537, key_size=2048)
    # 舊式 DSA
    dsa_key = dsa.generate_private_key(key_size=1024)
