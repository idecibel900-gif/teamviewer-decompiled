package o;

/* JADX INFO: loaded from: classes.dex */
public interface in1 {
    default float A0(long j) {
        if (!rt7.a(qt7.b(j), 4294967296L)) {
            mi3.b("Only Sp can convert to Px");
        }
        return d0(v(j));
    }

    default long I(float f) {
        return q(R(f));
    }

    default float O(int i) {
        return i / getDensity();
    }

    default float R(float f) {
        return f / getDensity();
    }

    float Z();

    default float d0(float f) {
        return getDensity() * f;
    }

    float getDensity();

    default int l0(long j) {
        return Math.round(A0(j));
    }

    default long q(float f) {
        float[] fArr = is2.a;
        if (Z() < 1.03f) {
            return h67.n(f / Z(), 4294967296L);
        }
        hs2 hs2VarA = is2.a(Z());
        return h67.n(hs2VarA != null ? hs2VarA.a(f) : f / Z(), 4294967296L);
    }

    default int q0(float f) {
        float fD0 = d0(f);
        if (Float.isInfinite(fD0)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(fD0);
    }

    default long r(long j) {
        if (j != 9205357640488583168L) {
            return nv1.a(R(Float.intBitsToFloat((int) (j >> 32))), R(Float.intBitsToFloat((int) (j & 4294967295L))));
        }
        return 9205357640488583168L;
    }

    default float v(long j) {
        if (!rt7.a(qt7.b(j), 4294967296L)) {
            mi3.b("Only Sp can convert to Px");
        }
        float[] fArr = is2.a;
        if (Z() < 1.03f) {
            return Z() * qt7.c(j);
        }
        hs2 hs2VarA = is2.a(Z());
        if (hs2VarA != null) {
            return hs2VarA.b(qt7.c(j));
        }
        return Z() * qt7.c(j);
    }

    default long w0(long j) {
        if (j == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        float fD0 = d0(a42.b(j));
        float fD1 = d0(a42.a(j));
        return (((long) Float.floatToRawIntBits(fD0)) << 32) | (((long) Float.floatToRawIntBits(fD1)) & 4294967295L);
    }
}
