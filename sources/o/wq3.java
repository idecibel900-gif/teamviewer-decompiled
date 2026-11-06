package o;

/* JADX INFO: loaded from: classes2.dex */
public final class wq3 extends gr3 {
    public final boolean m;
    public final String n;

    public wq3(String str, boolean z) {
        str.getClass();
        this.m = z;
        this.n = str.toString();
    }

    @Override // o.gr3
    public final String a() {
        return this.n;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wq3.class != obj.getClass()) {
            return false;
        }
        wq3 wq3Var = (wq3) obj;
        return this.m == wq3Var.m && im3.n(this.n, wq3Var.n);
    }

    public final int hashCode() {
        return this.n.hashCode() + (Boolean.hashCode(this.m) * 31);
    }

    @Override // o.gr3
    public final String toString() {
        boolean z = this.m;
        String str = this.n;
        if (!z) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        fb7.a(sb, str);
        return sb.toString();
    }
}
