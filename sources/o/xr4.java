package o;

/* JADX INFO: loaded from: classes.dex */
public final class xr4 {
    public final boolean a;

    public xr4(int i, boolean z) {
        this.a = (i & 1) != 0 ? true : z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xr4) && this.a == ((xr4) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + to7.f(hn6.m.hashCode() * 31, 29791, this.a);
    }
}
