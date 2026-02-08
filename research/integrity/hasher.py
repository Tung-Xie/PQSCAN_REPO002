import hashlib

def compute_hashes():
    # 嚴重碰撞風險的 Hash
    md5 = hashlib.md5(b"admin").hexdigest()
    sha1 = hashlib.sha1(b"password").hexdigest()
    # 現代 SHA-256 (非 PQC)
    sha256 = hashlib.sha256(b"data").hexdigest()
