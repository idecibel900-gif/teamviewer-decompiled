package o;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class tc extends sx3 {
    public final /* synthetic */ byte e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tc(Class cls, rc[] rcVarArr, byte b) {
        super(cls, rcVarArr);
        this.e = b;
    }

    public static void f(uc ucVar) {
        gb8.a(ucVar.o());
        b53 b53VarP = ucVar.p();
        b53 b53Var = b53.UNKNOWN_HASH;
        if (b53VarP == b53Var) {
            hk0.u("unknown HKDF hash type");
            return;
        }
        if (ucVar.q().n() == b53Var) {
            hk0.u("unknown HMAC hash type");
            return;
        }
        y53 y53VarQ = ucVar.q();
        if (y53VarQ.o() < 10) {
            hk0.u("tag size too small");
            return;
        }
        int iOrdinal = y53VarQ.n().ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    hk0.u("unknown hash type");
                    return;
                } else if (y53VarQ.o() > 64) {
                    hk0.u("tag size too big");
                    return;
                }
            } else if (y53VarQ.o() > 32) {
                hk0.u("tag size too big");
                return;
            }
        } else if (y53VarQ.o() > 20) {
            hk0.u("tag size too big");
            return;
        }
        if (ucVar.m() >= ucVar.q().o() + ucVar.o() + 9) {
            return;
        }
        hk0.u("ciphertext_segment_size must be at least (derived_key_size + tag_size + NONCE_PREFIX_IN_BYTES + 2)");
    }

    public static void g(cd cdVar) {
        gb8.a(cdVar.o());
        if (cdVar.p() == b53.UNKNOWN_HASH) {
            hk0.u("unknown HKDF hash type");
        } else {
            if (cdVar.m() >= cdVar.o() + 25) {
                return;
            }
            hk0.u("ciphertext_segment_size must be at least (derived_key_size + NONCE_PREFIX_IN_BYTES + TAG_SIZE_IN_BYTES + 2)");
        }
    }

    @Override // o.sx3
    public final String b() {
        switch (this.e) {
            case 0:
                return "type.googleapis.com/google.crypto.tink.AesCtrHmacStreamingKey";
            default:
                return "type.googleapis.com/google.crypto.tink.AesGcmHkdfStreamingKey";
        }
    }

    @Override // o.sx3
    public final ds1 c() {
        switch (this.e) {
            case 0:
                return new sc(this, (byte) 0);
            default:
                return new sc(this, (byte) 1);
        }
    }

    @Override // o.sx3
    public final s1 d(yh0 yh0Var) {
        switch (this.e) {
            case 0:
                return oc.q(yh0Var, cg2.a());
            default:
                return yc.q(yh0Var, cg2.a());
        }
    }

    @Override // o.sx3
    public final void e(s1 s1Var) throws GeneralSecurityException {
        switch (this.e) {
            case 0:
                oc ocVar = (oc) s1Var;
                int iO = ocVar.o();
                int i = gb8.a;
                if (iO < 0 || iO > 0) {
                    throw new GeneralSecurityException(String.format("key has version %d; only keys with version in range [0..%d] are supported", Integer.valueOf(iO), 0));
                }
                if (ocVar.m().size() < 16) {
                    hk0.u("key_value must have at least 16 bytes");
                    return;
                } else if (ocVar.m().size() >= ocVar.n().o()) {
                    f(ocVar.n());
                    return;
                } else {
                    hk0.u("key_value must have at least as many bits as derived keys");
                    return;
                }
            default:
                yc ycVar = (yc) s1Var;
                int iO2 = ycVar.o();
                int i2 = gb8.a;
                if (iO2 < 0 || iO2 > 0) {
                    throw new GeneralSecurityException(String.format("key has version %d; only keys with version in range [0..%d] are supported", Integer.valueOf(iO2), 0));
                }
                g(ycVar.n());
                return;
        }
    }
}
