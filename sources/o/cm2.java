package o;

/* JADX INFO: loaded from: classes.dex */
public final class cm2 implements sb1 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cm2) && Float.compare(1.0f, 1.0f) == 0;
    }

    @Override // o.sb1
    public final long g(long j, long j2) {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(1.0f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & 4294967295L);
        int i = qi6.a;
        return jFloatToRawIntBits;
    }

    public final int hashCode() {
        return Float.hashCode(1.0f);
    }

    public final String toString() {
        return "FixedScale(value=1.0)";
    }
}
