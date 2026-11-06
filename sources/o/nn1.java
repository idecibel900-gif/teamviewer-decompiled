package o;

/* JADX INFO: loaded from: classes.dex */
public final class nn1 implements in1 {
    public final float m;
    public final float n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final hs2 f1581o;

    public nn1(float f, float f2, hs2 hs2Var) {
        this.m = f;
        this.n = f2;
        this.f1581o = hs2Var;
    }

    @Override // o.in1
    public final float Z() {
        return this.n;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nn1)) {
            return false;
        }
        nn1 nn1Var = (nn1) obj;
        return Float.compare(this.m, nn1Var.m) == 0 && Float.compare(this.n, nn1Var.n) == 0 && this.f1581o.equals(nn1Var.f1581o);
    }

    @Override // o.in1
    public final float getDensity() {
        return this.m;
    }

    public final int hashCode() {
        return this.f1581o.hashCode() + e41.e(this.n, Float.hashCode(this.m) * 31, 31);
    }

    @Override // o.in1
    public final long q(float f) {
        return h67.n(this.f1581o.a(f), 4294967296L);
    }

    public final String toString() {
        StringBuilder sbN = e41.n("DensityWithConverter(density=", this.m, ", fontScale=", this.n, ", converter=");
        sbN.append(this.f1581o);
        sbN.append(")");
        return sbN.toString();
    }

    @Override // o.in1
    public final float v(long j) {
        if (rt7.a(qt7.b(j), 4294967296L)) {
            return this.f1581o.b(qt7.c(j));
        }
        hk0.l("Only Sp can convert to Px");
        return 0.0f;
    }
}
