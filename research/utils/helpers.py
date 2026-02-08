from cryptography.hazmat.primitives.asymmetric import padding
from cryptography.hazmat.primitives import hashes

def get_legacy_padding():
    pkcs1 = padding.PKCS1v15()
    sha1_alg = hashes.SHA1()
