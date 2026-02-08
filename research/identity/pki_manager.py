from cryptography.hazmat.primitives.asymmetric import rsa, dsa, ed25519

def manage_certs():
    rsa_2048 = rsa.generate_private_key(65537, 2048)
    dsa_1024 = dsa.generate_private_key(1024)
    ed25519_key = ed25519.Ed25519PrivateKey.generate()
