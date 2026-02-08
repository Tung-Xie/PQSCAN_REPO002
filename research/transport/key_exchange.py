from cryptography.hazmat.primitives.asymmetric import dh, ec

def legacy_kex():
    # 弱 Diffie-Hellman (1024-bit)
    parameters = dh.generate_parameters(generator=2, key_size=1024)
    # 經典橢圓曲線 (不抗量子)
    curve = ec.SECP256R1() 
    curve_legacy = ec.SECP192R1()
