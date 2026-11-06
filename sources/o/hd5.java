package o;

/* JADX INFO: loaded from: classes2.dex */
public final class hd5 implements vr0 {
    public final Class m;

    public hd5(Class cls, String str) {
        cls.getClass();
        this.m = cls;
    }

    @Override // o.vr0
    public final Class a() {
        return this.m;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hd5) {
            return im3.n(this.m, ((hd5) obj).m);
        }
        return false;
    }

    public final int hashCode() {
        return this.m.hashCode();
    }

    public final String toString() {
        return this.m.toString() + " (Kotlin reflection is not available)";
    }
}
