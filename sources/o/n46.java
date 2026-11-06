package o;

/* JADX INFO: loaded from: classes2.dex */
public final class n46 extends nc6 {
    public final String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f1539o;
    public final w36 p;

    public n46(String str, long j, w36 w36Var) {
        this.n = str;
        this.f1539o = j;
        this.p = w36Var;
    }

    @Override // o.nc6
    public final of0 E0() {
        return this.p;
    }

    @Override // o.nc6
    public final long j() {
        return this.f1539o;
    }

    @Override // o.nc6
    public final jo4 q() {
        String str = this.n;
        if (str != null) {
            e96 e96Var = jo4.e;
            try {
                return vt1.t(str);
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }
}
