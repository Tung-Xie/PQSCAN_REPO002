from cryptography.hazmat.primitives.asymmetric import rsa, dsa, ec, dh, ed25519, ed448

def legacy_pki():
    # Critical: 淘汰類 (NIST SP800-57)
    rsa_1024 = rsa.generate_private_key(public_exponent=65537, key_size=1024)
    dsa_1024 = dsa.generate_private_key(key_size=1024)
    
    # Critical Curves (RFC 8422)
    curves_critical = [ec.SECP160R1(), ec.SECP192R1(), ec.SECP224R1()]
    
    # Medium: 現代但量子脆弱
    rsa_3072 = rsa.generate_private_key(public_exponent=65537, key_size=3072)
    p256 = ec.SECP256R1() # P-256
    p384 = ec.SECP384R1() # P-384
    x25519 = ed25519.Ed25519PrivateKey.generate()
    x448 = ed448.Ed448PrivateKey.generate()
    
    # DH Group (RFC 7919)
    dh_params = dh.generate_parameters(generator=2, key_size=2048)
