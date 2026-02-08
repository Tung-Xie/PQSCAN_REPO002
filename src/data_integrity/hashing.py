import hashlib
from cryptography.hazmat.primitives import hashes

def compute_hashes():
    # Critical: 淘汰類
    md5 = hashlib.md5(b"data").hexdigest()
    sha1 = hashlib.sha1(b"data").hexdigest()
    sha224 = hashlib.sha224(b"data").hexdigest()
    
    # Medium: 現代標準
    sha256 = hashlib.sha256(b"data").hexdigest()
    sha384 = hashlib.sha384(b"data").hexdigest()
    sha512 = hashlib.sha512(b"data").hexdigest()
    
    # SHA-2 via cryptography library
    digest = hashes.Hash(hashes.SHA256())
