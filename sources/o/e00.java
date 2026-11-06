package o;

/* JADX INFO: loaded from: classes2.dex */
public final class e00 {
    public final int a;
    public final long b;

    public e00(int i, long j) {
        if (i == 0) {
            yq4.l("Null status");
            throw null;
        }
        this.a = i;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e00)) {
            return false;
        }
        e00 e00Var = (e00) obj;
        return ua5.a(this.a, e00Var.a) && this.b == e00Var.b;
    }

    public final int hashCode() {
        int iB = (ua5.B(this.a) ^ 1000003) * 1000003;
        long j = this.b;
        return ((int) ((j >>> 32) ^ j)) ^ iB;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackendResponse{status=");
        sb.append(ua5.C(this.a));
        sb.append(", nextRequestWaitMillis=");
        return e41.k(sb, this.b, "}");
    }
}
