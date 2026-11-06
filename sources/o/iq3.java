package o;

/* JADX INFO: loaded from: classes2.dex */
public final class iq3 extends vn4 {
    public final r8 s0;
    public final wj5 t0;

    public iq3(r8 r8Var, rp3 rp3Var) {
        this.s0 = r8Var;
        this.t0 = rp3Var.b;
    }

    @Override // o.vn4, o.aj1
    public final int g() {
        r8 r8Var = this.s0;
        String strM = r8Var.m();
        try {
            strM.getClass();
            u68 u68VarA = h57.A(10, strM);
            if (u68VarA != null) {
                return u68VarA.m;
            }
            bc7.I(strM);
            throw null;
        } catch (IllegalArgumentException unused) {
            r8.r(r8Var, to7.i('\'', "Failed to parse type 'UInt' for input '", strM), 0, null, 6);
            throw null;
        }
    }

    @Override // o.k01
    public final wj5 h() {
        return this.t0;
    }

    @Override // o.k01
    public final int l(fq6 fq6Var) {
        fq6Var.getClass();
        throw new IllegalStateException("unsupported");
    }

    @Override // o.vn4, o.aj1
    public final long p() {
        r8 r8Var = this.s0;
        String strM = r8Var.m();
        try {
            strM.getClass();
            z68 z68VarB = h57.B(strM);
            if (z68VarB != null) {
                return z68VarB.m;
            }
            bc7.I(strM);
            throw null;
        } catch (IllegalArgumentException unused) {
            r8.r(r8Var, to7.i('\'', "Failed to parse type 'ULong' for input '", strM), 0, null, 6);
            throw null;
        }
    }

    @Override // o.vn4, o.aj1
    public final byte x() {
        m68 m68Var;
        r8 r8Var = this.s0;
        String strM = r8Var.m();
        try {
            strM.getClass();
            u68 u68VarA = h57.A(10, strM);
            if (u68VarA != null) {
                int i = u68VarA.m;
                m68Var = Integer.compareUnsigned(i, 255) > 0 ? null : new m68((byte) i);
            }
            if (m68Var != null) {
                return m68Var.m;
            }
            bc7.I(strM);
            throw null;
        } catch (IllegalArgumentException unused) {
            r8.r(r8Var, to7.i('\'', "Failed to parse type 'UByte' for input '", strM), 0, null, 6);
            throw null;
        }
    }

    @Override // o.vn4, o.aj1
    public final short y() {
        g78 g78Var;
        r8 r8Var = this.s0;
        String strM = r8Var.m();
        try {
            strM.getClass();
            u68 u68VarA = h57.A(10, strM);
            if (u68VarA != null) {
                int i = u68VarA.m;
                g78Var = Integer.compareUnsigned(i, 65535) > 0 ? null : new g78((short) i);
            }
            if (g78Var != null) {
                return g78Var.m;
            }
            bc7.I(strM);
            throw null;
        } catch (IllegalArgumentException unused) {
            r8.r(r8Var, to7.i('\'', "Failed to parse type 'UShort' for input '", strM), 0, null, 6);
            throw null;
        }
    }
}
