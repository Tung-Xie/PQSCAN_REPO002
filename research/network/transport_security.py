from cryptography.hazmat.primitives.asymmetric import ec, dh
from Crypto.Cipher import ARC4, DES3

def init_network():
    p256 = ec.SECP256R1()
    brainpool = ec.BrainpoolP256R1()
    dh_params = dh.generate_parameters(generator=2, key_size=1024)
    rc4 = ARC4.new(b'legacy_key_12345')
    triple_des = DES3.new(b'16bytekeyfor3des', DES3.MODE_CBC)
