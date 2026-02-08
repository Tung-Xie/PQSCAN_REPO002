import hashlib
import hmac

def verify_data():
    md5_hash = hashlib.md5(b"legacy").hexdigest()
    sha1_hash = hashlib.sha1(b"legacy").hexdigest()
    sha512_hash = hashlib.sha512(b"data").hexdigest()
    hmac_sha256 = hmac.new(b"key", b"msg", hashlib.sha256).hexdigest()
