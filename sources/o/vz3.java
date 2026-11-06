package o;

/* JADX INFO: loaded from: classes2.dex */
public final class vz3 implements Comparable {
    public static final vz3 q = new vz3(2, 4, 20);
    public final byte m;
    public final byte n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final byte f2360o;
    public final int p;

    /* JADX WARN: Multi-variable type inference failed */
    public vz3(int i, int i2, int i3) {
        this.m = i;
        this.n = i2;
        this.f2360o = i3;
        if (i >= 0 && i < 256 && i2 >= 0 && i2 < 256 && i3 >= 0 && i3 < 256) {
            this.p = (i << 16) + (i2 << 8) + i3;
            return;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i + '.' + i2 + '.' + i3).toString());
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        vz3 vz3Var = (vz3) obj;
        vz3Var.getClass();
        return this.p - vz3Var.p;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        vz3 vz3Var = obj instanceof vz3 ? (vz3) obj : null;
        return vz3Var != null && this.p == vz3Var.p;
    }

    public final int hashCode() {
        return this.p;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((int) this.m);
        sb.append('.');
        sb.append((int) this.n);
        sb.append('.');
        sb.append((int) this.f2360o);
        return sb.toString();
    }
}
